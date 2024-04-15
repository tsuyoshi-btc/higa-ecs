# ベースイメージとしてAmazon Corretto 17を使用
FROM amazoncorretto:17

# 環境変数を設定
# ENV APP_FILE app.jar

# ビルド成果物を/app.jarにコピー
# COPY app/build/libs/*.jar /
COPY ./*.jar ./

# アプリケーションを実行
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "./app.jar"]
