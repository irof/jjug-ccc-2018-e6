JJUG CCC 2018 Fall e6
============================================================

[コードをどまんなかに据えた設計アプローチ](https://speakerdeck.com/irof/kodowodomannakaniju-etashe-ji-apuroti)

![](https://speakerd.s3.amazonaws.com/presentations/a8bb0866f87c4c1da18793db49f5b9e0/preview_slide_89.jpg)

90ページの [JIGを使った設計](https://speakerdeck.com/irof/kodowodomannakaniju-etashe-ji-apuroti?slide=90) のコードです。

## Getting Started

```
git clone https://github.com/irof/jjug-ccc-2018-e6.git
cd jjug-ccc-2018-e6
./gradlew jig
```

`build/jig` にJIGドキュメントが出力されます。
スライドとの対応は以下になります。

- 用語集: business-rule.xlsx
- 初期モデル: package-relation-depth6.svg

### 必須

- Java SE 8以降
- xlsxが開ける何か
- svgが開ける何か（Webブラウザで大丈夫）

### 推奨

- [Graphviz](https://www.graphviz.org/) のインストール
  - [Graphvizがインストールされていない環境で出力に失敗する問題](https://github.com/dddjava/Jig/issues/205)が報告されています。

## 題材

「現場で役立つシステム設計の原則」のp.107 図4-3「パッケージ図と依存関係」です。

## License

[MIT](LICENSE)

