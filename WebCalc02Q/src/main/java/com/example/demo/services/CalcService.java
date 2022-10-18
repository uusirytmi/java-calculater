package com.example.demo.services;

import java.math.BigDecimal;
import java.math.RoundingMode;

import org.springframework.stereotype.Component;

@Component
public class CalcService {
	//足し算
	public String calculateAdd(
			String NumA,
			String NumB

	) {
		BigDecimal AdA = null;
		BigDecimal AdB = null;
		try {
			AdA = new BigDecimal(NumA);
			AdB = new BigDecimal(NumB);
		} catch (Exception e) {
			return "数字以外の文字列が入っています。もう一度入力してください。";
			// TODO 自動生成された catch ブロック

		}
		BigDecimal AdR = AdA.add(AdB);
		String AdResult = AdR.toString();
		return AdResult;

	}

	//引き算
	public String calculateSubtract(
			String NumA,
			String NumB)

	{

		BigDecimal SbA = null;
		BigDecimal SbB = null;
		try {
			SbA = new BigDecimal(NumA);
			SbB = new BigDecimal(NumB);
		} catch (Exception e) {
			return "数字以外の文字列が入っています。もう一度入力してください。";
			// TODO 自動生成された catch ブロック
		}
		BigDecimal SbR = SbA.subtract(SbB);
		String SbResult = SbR.toString();
		return SbResult;

	}

	//掛け算
	public String calculateMultiply(
			String NumA,
			String NumB

	) {
		BigDecimal MlA = null;
		BigDecimal MlB = null;
		try {
			MlA = new BigDecimal(NumA);
			MlB = new BigDecimal(NumB);
		} catch (Exception e) {
			return "数字以外の文字列が入っています。もう一度入力してください。";

			// TODO 自動生成された catch ブロック
		}
		BigDecimal MlR = MlA.multiply(MlB);
		String MlResult = MlR.toString();
		return MlResult;

	}

	//割り算
	public String calculateDivide(
			String NumA,
			String NumB

	) {
		BigDecimal DvA = null;
		BigDecimal DvB = null;
		try {
			DvA = new BigDecimal(NumA);
			DvB = new BigDecimal(NumB);
		} catch (Exception e) {
			return "数字以外の文字列が入っています。もう一度入力してください。";

			// TODO 自動生成された catch ブロック
		}
		BigDecimal DvR = DvA.divide(DvB, 7, RoundingMode.HALF_UP);
		String DvResult = DvR.toString();
		return DvResult;

		//		割り算に関しては特殊なので注意
		//		
		//		ヒントとしてtry、catch構文も記載はしておきます。
		//		
		//		後は調べてね！

		//		try {
		//			BigDecimal AdR = 〇〇.〇〇(AdB);
		//			return AdR.toString();
		//		} catch (Exception e) {
		//			return "無限小数の答えになりました";
		//		}

		/*このコメントアウトは消さない方がいい
		 * これは無限少数の桁を設定する際に必要
		BigDecimal AdR = AdA.divide(AdB,7,RoundingMode.HALF_UP); //BigDecimal 〇〇= 〇〇.add(〇〇); これは足し算を書くとき
		String AdResult = AdR.toString();//toStringはクラスで定義されている文字列表現を返すメソッド
		return AdResult;
		*/

	}
}