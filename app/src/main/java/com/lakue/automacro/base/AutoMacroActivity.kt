package com.lakue.automacro.base

import androidx.annotation.LayoutRes
import androidx.databinding.ViewDataBinding
import com.lakue.lakue_library.ui.LakueActivity

open class AutoMacroActivity<B : ViewDataBinding, VM : AutoMacroViewModel>(
    @LayoutRes private val layoutResId: Int,
) : LakueActivity<B, VM>(layoutResId) {

    protected fun activityRefresh() {
        finish();
        overridePendingTransition(0, 0);
        startActivity(getIntent());
        overridePendingTransition(0, 0);
    }


}