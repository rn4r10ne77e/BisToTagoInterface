
# 서비스 중지
echo "Stopping the service..."
systemctl stop tago_link_module.service

# 서비스 비활성화
echo "Disabling the service..."
systemctl disable tago_link_module.service

# 파일 삭제
rm -rf /etc/systemd/system/tago_link_module.service

# systemd 데몬 리로드
echo "Reloading systemd daemon..."
systemctl daemon-reload