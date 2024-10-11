
# service 파일 복사
echo "Copy to system..."
cp ./tago_link_module.service /etc/systemd/system/

# systemd 데몬 리로드
echo "Reloading systemd daemon..."
systemctl daemon-reload

# 서비스 활성화
echo "Enabling the service..."
systemctl enable tago_link_module.service

# 서비스 시작
echo "Starting the service..."
systemctl start tago_link_module.service

# 서비스 상태 확인
systemctl status tago_link_module.service