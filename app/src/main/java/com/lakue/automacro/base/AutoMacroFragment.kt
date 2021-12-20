package com.lakue.automacro.base

import androidx.databinding.ViewDataBinding
import com.lakue.lakue_library.ui.LakueActivity
import com.lakue.lakue_library.ui.LakueFragment

open class AutoMacroFragment<B : ViewDataBinding, VM : AutoMacroViewModel>(layoutResId: Int) :
    LakueFragment<B, VM>(layoutResId) {

    override fun onDestroyView() {
        super.onDestroyView()
        viewModel.resetValue()
    }

    protected fun activityRefresh() {
        (activity as LakueActivity<*, *>).apply{
            finish()
            overridePendingTransition(0, 0)
            startActivity(intent)
            overridePendingTransition(0, 0);
        }
    }


}