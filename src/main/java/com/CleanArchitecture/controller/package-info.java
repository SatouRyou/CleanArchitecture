/**
 * Created by teradashoutarou on 2016/09/02.
 *
 * 外部からの呼び出し(マイクロサービス、フロントエンドからの呼び出し)
 * を記述するパッケージ
 * 基本的には受け取るだけで、ロジックは書かないこと
 * 例外的に、dusecase、domain層で利用するデータ構造への変化は
 * 再利用性と、疎結合を維持するために許容する
 */
package com.CleanArchitecture.controller;