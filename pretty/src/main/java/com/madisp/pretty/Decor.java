package com.madisp.pretty;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * A class that operates on already constructed views, i.e., decorates them.
 */
public interface Decor {
    /**
     * Decorates the given view.
     * This method will be called by Pretty for every {@link android.view.View} created in the layout
     * if {@link com.madisp.pretty.Pretty#wrap(android.app.Activity)} was called and the decor added
     * with {@link com.madisp.pretty.Pretty#with(Decor)}
     * @param view The view to decorate. Never null.
     * @param parent The parent view, if available. May be null.
     * @param name The name of the tag in the layout file, e.g. {@code TextView}.
     * @param context The context where the view was constructed in.
     * @param attrs A read-only set of tag attributes.
     */
    public void apply(@NotNull View view, @Nullable View parent, @NotNull String name, @NotNull Context context, @NotNull AttributeSet attrs);
}
