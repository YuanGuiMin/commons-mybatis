package com.meowu.commons.mybatis.mysql.page;

import com.meowu.commons.utils.security.page.Page;
import com.meowu.commons.utils.security.page.PageRequest;

import java.util.List;

public class MySqlPage<T> extends Page{

    public MySqlPage(List<T> content, Long total, PageRequest pageRequest){
        super(content, total, pageRequest);
    }

    @Override
    public boolean hasNext(){
        return getPageRequest().getOffset() + getContent().size() < getTotal();
    }
}
