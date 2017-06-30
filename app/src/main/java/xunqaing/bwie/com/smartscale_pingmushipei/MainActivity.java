package xunqaing.bwie.com.smartscale_pingmushipei;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import xunqaing.bwie.com.smartscale_pingmushipei.utils.DeviceUtils;

//http://www.jianshu.com/p/ec5a1a30694b

//  获取标题栏高度 --- http://www.cnblogs.com/developer-wang/p/6771073.html?utm_source=itdadao&utm_medium=referral

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Point(360, 640)  通知栏高度
        Log.e("xunxun getDisplayInfomation",""+DeviceUtils.getDisplayInfomation(getApplication()));

//        100dp --- 94px
        Log.e("xunxun dip2px",""+DeviceUtils.dip2px(this,100));

//        94px --- 100dp
        Log.e("xunxun dip2px",""+DeviceUtils.px2dip(this,94));

        /**
         * 获取状态栏高度——方法1
         * */
        int statusBarHeight1 = -1;
        //获取status_bar_height资源的ID
        int resourceId = getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (resourceId > 0) {
            //根据资源ID获取响应的尺寸值
            statusBarHeight1 = getResources().getDimensionPixelSize(resourceId);
        }
        Log.e("xunxun ", "状态栏-方法1:" + statusBarHeight1);

    }

}
