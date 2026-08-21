package net.typeblog.shelter.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.TypedValue;
import android.view.View;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import androidx.preference.Preference;
import androidx.preference.PreferenceCategory;
import androidx.preference.PreferenceGroupAdapter;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.color.MaterialColors;

@SuppressLint("RestrictedApi")
public class SettingsCardDecoration extends RecyclerView.ItemDecoration {
    private final Paint mCardPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
    private final Paint mDividerPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
    private final Path mPath = new Path();
    private final RectF mRect = new RectF();
    private final float[] mRadii = new float[8];
    private final float mCornerRadius;
    private final float mHorizontalMargin;
    private final float mDividerInset;
    private final float mDividerHeight;

    public SettingsCardDecoration(Context context) {
        mCornerRadius = dpToPx(context, 16);
        mHorizontalMargin = dpToPx(context, 16);
        mDividerInset = dpToPx(context, 56);
        mDividerHeight = dpToPx(context, 1);

        int cardColor = MaterialColors.getColor(context, com.google.android.material.R.attr.colorSurfaceContainer, 0xFF2A2A2A);
        mCardPaint.setColor(cardColor);
        mCardPaint.setStyle(Paint.Style.FILL);

        int dividerColor = MaterialColors.getColor(context, com.google.android.material.R.attr.colorOutlineVariant, 0x1FFFFFFF);
        mDividerPaint.setColor(dividerColor);
        mDividerPaint.setStrokeWidth(mDividerHeight);
        mDividerPaint.setStyle(Paint.Style.STROKE);
    }

    private static float dpToPx(Context context, float dp) {
        return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp, context.getResources().getDisplayMetrics());
    }

    @Override
    public void getItemOffsets(@NonNull Rect outRect, @NonNull View view, @NonNull RecyclerView parent, @NonNull RecyclerView.State state) {
        RecyclerView.Adapter<?> adapter = parent.getAdapter();
        if (!(adapter instanceof PreferenceGroupAdapter)) {
            super.getItemOffsets(outRect, view, parent, state);
            return;
        }

        PreferenceGroupAdapter prefAdapter = (PreferenceGroupAdapter) adapter;
        int position = parent.getChildAdapterPosition(view);
        if (position == RecyclerView.NO_POSITION || position >= prefAdapter.getItemCount()) {
            return;
        }

        Preference item = prefAdapter.getItem(position);
        if (item instanceof PreferenceCategory) {
            int topOffset = (position == 0) ? (int) dpToPx(view.getContext(), 8) : (int) dpToPx(view.getContext(), 20);
            outRect.set((int) mHorizontalMargin, topOffset, (int) mHorizontalMargin, (int) dpToPx(view.getContext(), 6));
        } else {
            boolean isLast = (position == prefAdapter.getItemCount() - 1)
                    || (position + 1 < prefAdapter.getItemCount() && prefAdapter.getItem(position + 1) instanceof PreferenceCategory);
            int bottomOffset = isLast ? (int) dpToPx(view.getContext(), 8) : 0;
            outRect.set((int) mHorizontalMargin, 0, (int) mHorizontalMargin, bottomOffset);
        }
    }

    @Override
    public void onDraw(@NonNull Canvas c, @NonNull RecyclerView parent, @NonNull RecyclerView.State state) {
        RecyclerView.Adapter<?> adapter = parent.getAdapter();
        if (!(adapter instanceof PreferenceGroupAdapter)) return;

        PreferenceGroupAdapter prefAdapter = (PreferenceGroupAdapter) adapter;
        int childCount = parent.getChildCount();

        for (int i = 0; i < childCount; i++) {
            View child = parent.getChildAt(i);
            int position = parent.getChildAdapterPosition(child);
            if (position == RecyclerView.NO_POSITION || position >= prefAdapter.getItemCount()) {
                continue;
            }

            Preference item = prefAdapter.getItem(position);
            if (item instanceof PreferenceCategory) {
                continue;
            }

            boolean isFirst = (position == 0)
                    || (position > 0 && prefAdapter.getItem(position - 1) instanceof PreferenceCategory);
            boolean isLast = (position == prefAdapter.getItemCount() - 1)
                    || (position + 1 < prefAdapter.getItemCount() && prefAdapter.getItem(position + 1) instanceof PreferenceCategory);

            float left = child.getLeft();
            float top = child.getTop();
            float right = child.getRight();
            float bottom = child.getBottom();

            mRect.set(left, top, right, bottom);
            mPath.reset();

            float topRadius = isFirst ? mCornerRadius : 0f;
            float bottomRadius = isLast ? mCornerRadius : 0f;

            mRadii[0] = topRadius;
            mRadii[1] = topRadius;
            mRadii[2] = topRadius;
            mRadii[3] = topRadius;
            mRadii[4] = bottomRadius;
            mRadii[5] = bottomRadius;
            mRadii[6] = bottomRadius;
            mRadii[7] = bottomRadius;

            mPath.addRoundRect(mRect, mRadii, Path.Direction.CW);
            c.drawPath(mPath, mCardPaint);

            if (!isLast) {
                float dividerY = bottom - mDividerHeight / 2f;
                c.drawLine(left + mDividerInset, dividerY, right - dpToPx(child.getContext(), 16), dividerY, mDividerPaint);
            }
        }
    }
}
