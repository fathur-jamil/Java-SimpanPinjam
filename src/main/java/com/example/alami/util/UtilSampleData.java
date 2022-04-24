package com.example.alami.util;

import com.example.alami.model.entity.EntityTransaction;
import com.example.alami.model.entity.EntityUser;
import com.example.alami.repository.RepositoryTransaction;
import com.example.alami.repository.RepositoryUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class UtilSampleData implements ApplicationRunner {

    @Autowired
    RepositoryUser repositoryUser;

    @Autowired
    RepositoryTransaction repositoryTransaction;

    @Override
    public void run(ApplicationArguments args) {
        EntityUser entityUserWawan = new EntityUser();
        entityUserWawan.setId(1120220101000000001L);
        entityUserWawan.setName("WAWAN SETIAWAN");
        entityUserWawan.setDateOfBirth(getDate("10011990"));
        entityUserWawan.setAddress("KOMPLEKS ASIA SERASI NO 100");
        repositoryUser.save(entityUserWawan);

        EntityUser entityUserTeguh = new EntityUser();
        entityUserTeguh.setId(1120220101000000002L);
        entityUserTeguh.setName("TEGUH SUDIBYANTORO");
        entityUserTeguh.setDateOfBirth(getDate("10021991"));
        entityUserTeguh.setAddress("JALAN PAMEKARAN NO 99");
        repositoryUser.save(entityUserTeguh);

        EntityUser entityUserJoko = new EntityUser();
        entityUserJoko.setId(1120220101000000003L);
        entityUserJoko.setName("JOKO WIDODO");
        entityUserJoko.setDateOfBirth(getDate("10031992"));
        entityUserJoko.setAddress("DUSUN PISANG RT 10 RW 20");
        repositoryUser.save(entityUserJoko);

        EntityTransaction entityTransactionSatu = new EntityTransaction();
        entityTransactionSatu.setId(1220220101000000001L);
        entityTransactionSatu.setUserId(1120220101000000001L);
        entityTransactionSatu.setUserName("WAWAN SETIAWAN");
        entityTransactionSatu.setType("PENYERAHAN DANA");
        entityTransactionSatu.setCurrency("IDR");
        entityTransactionSatu.setAmount(1000000L);
        entityTransactionSatu.setDate(getDate("17082020"));
        repositoryTransaction.save(entityTransactionSatu);

        EntityTransaction entityTransactionDua = new EntityTransaction();
        entityTransactionDua.setId(1220220101000000002L);
        entityTransactionDua.setUserId(1120220101000000002L);
        entityTransactionDua.setUserName("TEGUH SUDIBYANTORO");
        entityTransactionDua.setType("PENYERAHAN DANA");
        entityTransactionDua.setCurrency("IDR");
        entityTransactionDua.setAmount(5000000L);
        entityTransactionDua.setDate(getDate("18082020"));
        repositoryTransaction.save(entityTransactionDua);

        EntityTransaction entityTransactionTiga = new EntityTransaction();
        entityTransactionTiga.setId(1220220101000000003L);
        entityTransactionTiga.setUserId(1120220101000000003L);
        entityTransactionTiga.setUserName("JOKO WIDODO");
        entityTransactionTiga.setType("PEMINJAMAN DANA");
        entityTransactionTiga.setCurrency("IDR");
        entityTransactionTiga.setAmount(2000000L);
        entityTransactionTiga.setDate(getDate("30092020"));
        repositoryTransaction.save(entityTransactionTiga);

        EntityTransaction entityTransactionEmpat = new EntityTransaction();
        entityTransactionEmpat.setId(1220220101000000004L);
        entityTransactionEmpat.setUserId(1120220101000000003L);
        entityTransactionEmpat.setUserName("JOKO WIDODO");
        entityTransactionEmpat.setType("PENGEMBALIAN DANA");
        entityTransactionEmpat.setCurrency("IDR");
        entityTransactionEmpat.setAmount(1000000L);
        entityTransactionEmpat.setDate(getDate("10112020"));
        repositoryTransaction.save(entityTransactionEmpat);

        EntityTransaction entityTransactionLima = new EntityTransaction();
        entityTransactionLima.setId(1220220101000000005L);
        entityTransactionLima.setUserId(1120220101000000001L);
        entityTransactionLima.setUserName("WAWAN SETIAWAN");
        entityTransactionLima.setType("PENYERAHAN DANA");
        entityTransactionLima.setCurrency("IDR");
        entityTransactionLima.setAmount(5000000L);
        entityTransactionLima.setDate(getDate("01122020"));
        repositoryTransaction.save(entityTransactionLima);

        EntityTransaction entityTransactionEnam = new EntityTransaction();
        entityTransactionEnam.setId(1220220101000000006L);
        entityTransactionEnam.setUserId(1120220101000000002L);
        entityTransactionEnam.setUserName("TEGUH SUDIBYANTORO");
        entityTransactionEnam.setType("PENGAMBILAN DANA");
        entityTransactionEnam.setCurrency("IDR");
        entityTransactionEnam.setAmount(2000000L);
        entityTransactionEnam.setDate(getDate("01122020"));
        repositoryTransaction.save(entityTransactionEnam);
    }

    private Date getDate(String date) {
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("ddMMyyyy");
            return simpleDateFormat.parse(date);
        } catch (ParseException e) {
            e.getMessage();
            return null;
        }
    }

}
