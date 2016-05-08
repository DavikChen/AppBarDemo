# AppBarDemo
appBar的使用例子

# Activity 和fragment之间的数据回调

1.定义一个传递回调数据的接口
2.在相应的事件中初始化回调方法 传递数据
3.Activity页面接受传递过来的数据 

# fragment 和fragment之间的数据回调
同上
需要特别注意需要用到  setTargetFragment 方法
  editNameDialogFragment.setTargetFragment(UserLoginFragment.this,300);
  
  在fragment 点击函数中 通过如下使用:
  
  EditNameDialogListener listenerFragment = (EditNameDialogListener) getTargetFragment();
  listenerFragment.onFinishEditDialog(mEditText.getText().toString());

  源码注释:
  ![](https://github.com/DavikChen/AppBarDemo/blob/master/setTargetFragment.png)  
  
#统一配置app中的dialog & 提醒对话框的样式

    <!-- Apply default style for dialogs -->
    <item name="android:dialogTheme">@style/AppDialogTheme</item>
    <!-- Apply default style for alert dialogs -->
    <item name="android:alertDialogTheme">@style/AppAlertTheme</item>
    
#更多DialogFragment 的使用参考
 [Using DialogFragment](https://github.com/codepath/android_guides/wiki/Using-DialogFragment)
