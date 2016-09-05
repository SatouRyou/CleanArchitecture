package com.CleanArchitecture.infrastructure.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by teradashoutarou on 2016/09/03.
 */
// Entity(テーブル構造をオブジェクト化したもの)としてフレームワークに登録するアノテーション
@Entity
@Data
// どのテーブルのEntityかフレームワークに登録するアノテーション
@Table(name="Customer")
public class CustomerEntity {
    private int id;
    private String Name;
}
