package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.repositories.Webcalc_Result_Repository;
import com.example.demo.services.CalcService;

@Controller
public class CalcController {

	@Autowired
	private CalcService service;
	//ここから
	@Autowired
	private Webcalc_Result_Repository webcalc_Result_Repository;

	public String insertTable(String calcResult) {
		System.out.println("[START] ORALCEに接続してデータを取得");
		webcalc_Result_Repository.insertResult(calcResult);
		System.out.println("[END ] ORALCEに接続してデータを取得");
		return calcResult;
	}

	@PostMapping("calc") //ルーティング
	public String calc() {

		return "calc";
	}//ここまで

	@PostMapping("resAdd") //ルーティングってなに
	public String resAdd(
			Model model,
			@RequestParam("numA") String NumA,
			@RequestParam("numB") String NumB

	) {
		String AddResult = //ここから
				service.calculateAdd(NumA, NumB);

		if (AddResult == "Aderror") { //計算結果がエラーならエラー画面へ飛ぶ
			return "error";
		}
		model.addAttribute("kotae", AddResult);//大事
		insertTable(AddResult);//ここまで

		return "res";

	}

	@PostMapping("resSub")
	public String resSub(
			Model model,
			@RequestParam("numA") String NumA,
			@RequestParam("numB") String NumB

	) {
		String SubResult = service.calculateSubtract(NumA, NumB);//string subresultって箱作って
																	//その中にmodelメソッド入れてる。
																	//あとはifでエラー吐き出すようにしてるだけ
		if (SubResult == "Suberror") {
			return "error";
		}
		model.addAttribute("kotae", SubResult);
		insertTable(SubResult);

		return "res";

	}

	@PostMapping("resMul")
	public String resMul(
			Model model,
			@RequestParam("numA") String NumA,
			@RequestParam("numB") String NumB

	) {

		String MulResult = service.calculateMultiply(NumA, NumB);//ここも引き算と同じようにしている
		if (MulResult == "Mulerror") {
			return "error";
		}
		model.addAttribute("kotae", MulResult);
		insertTable(MulResult);

		return "res";

	}

	@PostMapping("resDiv")
	public String resDiv(
			Model model,
			@RequestParam("numA") String NumA,
			@RequestParam("numB") String NumB

	) {

		String DivResult = service.calculateDivide(NumA, NumB);//ここも同じ。箱を作ることでservice関数とif文を同時処理させる

		if (DivResult == "Diverror") {
			return "error";
		}
		model.addAttribute("kotae", DivResult);
		insertTable(DivResult);

		return "res";

	}

	//	引き算、掛け算、割り算を記載していきましょう。
	//	ですが、割り算はちょっと特殊なので注意しましょう！
	//	割り算の答えの出し方をよく思い出してくださいね、他の掛け算までの答え方とは別で回答パターンが複数あると思います、
	//	それを意識してコードを書いていってください。

}