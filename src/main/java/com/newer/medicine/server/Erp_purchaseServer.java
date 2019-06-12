package com.newer.medicine.server;


import com.newer.medicine.domain.Erp_purchase;
import com.newer.medicine.mapper.Erp_purchaseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Erp_purchaseServer {
    @Autowired
    private Erp_purchaseMapper erp_purchaseMapper;
    public  List<Erp_purchase> selectErp_applyasset(){
        List<Erp_purchase> erp_applyassetList=erp_purchaseMapper.selectErp_applyasset();
        return erp_applyassetList;
    }

    public int selectErp_applyassetCount(){

        return erp_purchaseMapper.selectErp_applyassetCount();
    }
}