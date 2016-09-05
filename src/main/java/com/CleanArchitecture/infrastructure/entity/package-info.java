/**
 * Created by teradashoutarou on 2016/09/02.
 * データベースのテーブル構造をオブジェクトしたものを配置すること
 * ロジックに対し、インフラの設定を依存させないために、
 * このパッケーシに配置してあるデータは、usecase、domain層に
 * 渡さないこと
 * 必ず、domain層のdtoに変換して渡すこと
 */
package com.CleanArchitecture.infrastructure.entity;