package top.simuhunluo.salary.utils;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import top.simuhunluo.salary.exception.SalaryErrorCode;
import top.simuhunluo.salary.exception.SalaryException;

import java.util.regex.Pattern;

public class PageUtils {

    public static <E> Page<E> startPage(int pageNum, int pageSize, String orderBy) {
        //如果pageSize=0,即不执行分页。pageHelper也不会执行orderBy。
        if (pageSize == 0) { // 不分页
            return PageHelper.startPage(pageNum, 0, true, null, true);
        } else { // 分页
            if (orderBy != null) {
                return PageHelper.startPage(pageNum, pageSize, symbolReplace(orderBy));
            } else {
                return PageHelper.startPage(pageNum, pageSize);
            }
        }

    }

    public static String symbolReplace(String sort) {
        if (!Pattern.matches("((\\+|\\-)[\\w]+)+", sort)) {
//            throw new SkyRestException(SkyRestErrorCode.ILLEGAL_SORT_TYPE);
            throw new SalaryException(SalaryErrorCode.ILLEGAL_SORT_TYPE);
        }
        sort = sort.replaceAll("\\+([\\w]+)", " $1" + " asc,");
        sort = sort.replaceAll("\\-([\\w]+)", " $1" + " desc,");
        sort = sort.substring(0, sort.length() - 1);
        return sort;
    }
}
