package test;

import java.io.Serializable;
import java.util.List;

/**
 * @Author: csz
 * @Date: 2018/10/10 15:36
 */
public class PageInfo <T> implements Serializable {
    //查询出的总条数
    private Integer selectCount;

    //查询出的数据
    private List<T> datas;

    //开始下标
    private Integer start;

    //每页条数
    private Integer pageCount;

    //页数
    private Integer page;

    public PageInfo() {
    }

    public PageInfo(Integer pageCount, Integer page ,Integer start) {
        this.pageCount = pageCount;
        if (start == null && page != null){
            this.page = page;
            this.start = (page - 1) * pageCount;
        }else {
            this.start = start;
        }
    }



    public Integer getSelectCount() {
        return selectCount;
    }

    public void setSelectCount(Integer selectCount) {
        this.selectCount = selectCount;
    }

    public List<T> getDatas() {
        return datas;
    }

    public void setDatas(List<T> datas) {
        this.datas = datas;
    }

    public Integer getStart() {
        return start;
    }

    public Integer getPageCount() {
        return pageCount;
    }

    public Integer getPage() {
        return page;
    }



}
