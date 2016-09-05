/**
 * Created by teradashoutarou on 2016/09/02.
 *
 * 画面からのリクエストデータをそのまま、ロジック部分に渡したくない場合、
 * このadapterで変換処理を行う。
 * これによって、画面からのリクエストデータの構造に変化が発生しても、
 * 修正範囲を最小限に抑えることができ、
 * 再利用性と、疎結合が保たれる
 */
package com.CleanArchitecture.controller.adapter;