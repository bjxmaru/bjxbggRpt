package com.bjx.util;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.bjx.domain.mysql.FuncTree;

/**
 * Created by bjx on 2017/4/21.
 */
public class Json2ObjectUtil {


    public  static  void  funcTreeJsonUtil( JSONObject jsonObject , FuncTree funcTree  ) {

        jsonObject.put("id",funcTree.getId()) ;
        jsonObject.put("text" , funcTree.getMenuName()) ;
        jsonObject.put("state" , funcTree.getIsleaf().equals("Y")?"opened":"closed") ;

        JSONArray jsonArray = null;

        if( funcTree.getChildList() != null &&  funcTree.getChildList().size() >0 ) {
            jsonArray = new JSONArray() ;
            for( FuncTree tmpFuncTree : funcTree.getChildList() ) {

                JSONObject tmpJsonObject = new JSONObject() ;
                funcTreeJsonUtil(tmpJsonObject , tmpFuncTree); ;
                jsonArray.add(tmpJsonObject);
            }


        }

        if( jsonArray != null && jsonArray.size() > 0 ) {
            jsonObject.put("children" , jsonArray) ;
        }



    }


}
