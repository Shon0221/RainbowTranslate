package com.example.vincentwang.rainbowtranslate.framework

/**
 * Created by vincentwang on 2018/2/23.
 */
interface BaseContract {
    interface View:ProgressbarListener{
        fun gotoTranslateFragment(word:String)
        fun gotoSearchStoreFragment()
    }

}