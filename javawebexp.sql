/*
Navicat MySQL Data Transfer

Source Server         : mysql145
Source Server Version : 80017
Source Host           : localhost:3306
Source Database       : javawebexp

Target Server Type    : MYSQL
Target Server Version : 80017
File Encoding         : 65001

Date: 2019-12-14 19:23:18
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for goods
-- ----------------------------
DROP TABLE IF EXISTS `goods`;
CREATE TABLE `goods` (
  `gNo` varchar(255) NOT NULL,
  `gName` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `gIntroduce` varchar(255) NOT NULL,
  `gMoney` double NOT NULL,
  `gReserve` int(11) NOT NULL,
  `gType` int(11) NOT NULL,
  `gUrl` varchar(255) NOT NULL,
  `gDetail` varchar(255) NOT NULL,
  `gUrl2` varchar(255) NOT NULL,
  PRIMARY KEY (`gNo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of goods
-- ----------------------------
INSERT INTO `goods` VALUES ('20aef80d-bb63-4328-b3ec-9825d489103f', 'JSon电动剃须刀S500', '浮动贴面更干净 / 减压设计更舒适', '179', '668', '1', '../img/20aef80d-bb63-4328-b3ec-9825d489103f_1.png', '360°浮动贴面|IFT 悬挂浮动|双层刀片|全身可水洗|LED显示屏|Type-C 充电', '../img/20aef80d-bb63-4328-b3ec-9825d489103f_2.png');
INSERT INTO `goods` VALUES ('48468b62-4ae4-40db-9cca-5b8c3d4e4dfb', 'JSon商旅多功能双肩包', '拎包说走就走，世界在你面前展开', '199', '562', '1', '../img/48468b62-4ae4-40db-9cca-5b8c3d4e4dfb_1.png', '颜色：深灰色|面料：聚酯纤维|里料：聚酯纤维|容积：26L|重量：0.93kg|尺寸：325x180x445mm', '../img/48468b62-4ae4-40db-9cca-5b8c3d4e4dfb_2.png');
INSERT INTO `goods` VALUES ('9226ba1e-8429-4663-8693-97b05c0954f3', 'JSon无线充电宝青春版10000mAh', '随时随地，无线有线都能充~ 充电，自充，一根线搞定~', '129', '340', '1', '../img/9226ba1e-8429-4663-8693-97b05c0954f3_1.png', '10W MAX 无线快充|2台设备可同时充电|可上飞机随行 智能芯片安全保障|Qi 无线标准 苹果三星也能用~', '../img/9226ba1e-8429-4663-8693-97b05c0954f3_2.png');
INSERT INTO `goods` VALUES ('9608ef94-eeb9-4b7f-aaad-f2918a5bf02e', 'JSon 平衡车燃动版', '燃动升级，随走随停畅行无阻', '2299', '42', '1', '../img/9608ef94-eeb9-4b7f-aaad-f2918a5bf02e_1.png', '铝合金停车支架|可折叠拉杆|越野风格外观|22k\'m长续航', '../img/9608ef94-eeb9-4b7f-aaad-f2918a5bf02e_2.png');
INSERT INTO `goods` VALUES ('b0683161-4d3e-4c4b-86f6-514dbd86e880', 'JSon 平板电脑·', '8\" 屏幕，单手可握的追剧神器 10.1\"屏幕，看剧更震撼', '1399', '20', '1', '../img/b0683161-4d3e-4c4b-86f6-514dbd86e880_1.png', '全高清屏幕 16:10 显示比例|金属机身 一体式全金属后盖|骁龙660 AIE 八核高性能处理器|超长续航 6000mAh / 8620mAh|AI 人脸识别 快捷解锁方式|AI 语音助手 一句话搞定复杂操作|后置 1300 万 高画质相机|前置 500 万 美颜相机', '../img/b0683161-4d3e-4c4b-86f6-514dbd86e880_2.png');
INSERT INTO `goods` VALUES ('c594025e-a76c-43e9-b677-8234260c5819', 'Json Pro', '高颜值，高品位，低价位，年轻人的首选手机，你值得拥有~', '4999', '98', '1', '../img/c594025e-a76c-43e9-b677-8234260c5819_1.png', '5G双卡全网通|晓龙855Plus|30W无线闪充|VC液冷散热|渐变陶瓷外壳|1亿像素|光学防抖', '../img/c594025e-a76c-43e9-b677-8234260c5819_2.png');
INSERT INTO `goods` VALUES ('d9b5fda1-b46a-4507-a8c6-c5c48385ed1e', 'JSon人工智能语音电视', '人工智能 语音系统 一句话的事儿，就能帮 你搜片、查天气，还能 控制智能设备。', '2899', '99', '1', '../img/d9b5fda1-b46a-4507-a8c6-c5c48385ed1e_1.png', 'FHD全高清屏  画质更清晰震撼|人工智能语音  语音搜片、控制智能设备|FHD全高清屏  画质更清晰震撼  人工智能语音  语音搜片、控制智能设备  大存储  1GB+8GB|高性能  64位四核处理器|海量内容  天天都有新内容|钢琴烤漆  更有艺术质感', '../img/d9b5fda1-b46a-4507-a8c6-c5c48385ed1e_2.png');
INSERT INTO `goods` VALUES ('e9691487-4fe5-403f-bde4-71731799a548', 'JSon 笔记本 15.6寸 ', '全面均衡的国民轻薄本 第八代酷睿™ 四核处理器', '7899', '49', '1', '../img/e9691487-4fe5-403f-bde4-71731799a548_1.png', '八代四核 英特尔®酷睿™ 处理器|GeForce® MX110 独立显卡，2GB 显存|双风扇散热系统 双出风口，2+2 热管布局|双内存大硬盘可扩展 最高可选512GB SSD|7大接口 即插即用，无需转接器|独立数字键盘 数字录入快捷高效', '../img/e9691487-4fe5-403f-bde4-71731799a548_2.png');
INSERT INTO `goods` VALUES ('f2dec7ab-c46c-4ada-b962-e41146830a8a', 'JSon 游戏本', '游戏人生，流畅到不行~', '8888', '53', '1', '../img/f2dec7ab-c46c-4ada-b962-e41146830a8a_1.png', '第八代酷睿i7六核标压处理器|72%NTSC高色域窄边框全高清屏 |256G高速固态|双烤不限频不降频|冷酷到底的散热系统', '../img/f2dec7ab-c46c-4ada-b962-e41146830a8a_2.png');
INSERT INTO `goods` VALUES ('f9180160-a5a7-42a2-8d81-852ab20a4a54', 'JSon 保温杯', '已温度的名义，与时间为敌', '99', '343', '1', '../img/f9180160-a5a7-42a2-8d81-852ab20a4a54_1.png', '31 6L 不锈钢内胆 |超轻旋薄内胆|长效保温保冷|480mL大容量', '../img/f9180160-a5a7-42a2-8d81-852ab20a4a54_2.png');

-- ----------------------------
-- Table structure for record
-- ----------------------------
DROP TABLE IF EXISTS `record`;
CREATE TABLE `record` (
  `rNo` varchar(255) NOT NULL,
  `uNo` varchar(255) NOT NULL,
  `gNo` varchar(255) NOT NULL,
  `rTime` datetime NOT NULL,
  `rType` int(11) NOT NULL,
  `gNum` int(11) NOT NULL,
  `gMoney` double NOT NULL,
  PRIMARY KEY (`rNo`),
  KEY `uNo` (`uNo`),
  KEY `gNo` (`gNo`),
  CONSTRAINT `record_ibfk_1` FOREIGN KEY (`uNo`) REFERENCES `user` (`uNo`) ON DELETE CASCADE,
  CONSTRAINT `record_ibfk_2` FOREIGN KEY (`gNo`) REFERENCES `goods` (`gNo`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of record
-- ----------------------------
INSERT INTO `record` VALUES ('098ea8e5-280f-4b20-ba5d-cf90fedf3292', '007515b2-978a-41b3-b052-af5b06b6ea3c', '9608ef94-eeb9-4b7f-aaad-f2918a5bf02e', '2019-12-06 21:40:21', '3', '1', '2299');
INSERT INTO `record` VALUES ('0f106e09-698d-4d2a-a8bc-daad2ea2527c', 'e06b8b3b-7750-4472-bd88-fea0a0d5f5e1', '9226ba1e-8429-4663-8693-97b05c0954f3', '2019-12-06 21:44:20', '1', '0', '0');
INSERT INTO `record` VALUES ('142352f1-5ae7-48a7-9b04-59c9c5fadb63', 'e06b8b3b-7750-4472-bd88-fea0a0d5f5e1', 'f9180160-a5a7-42a2-8d81-852ab20a4a54', '2019-12-06 21:45:32', '3', '1', '99');
INSERT INTO `record` VALUES ('2dd1f84d-7081-46c2-a4f8-ebcecacb62c0', 'e06b8b3b-7750-4472-bd88-fea0a0d5f5e1', '20aef80d-bb63-4328-b3ec-9825d489103f', '2019-12-06 21:45:29', '3', '6', '179');
INSERT INTO `record` VALUES ('33aca42e-a290-4add-9f5b-3ee3a41bbf5e', 'eafe9ff3-f65b-4f69-bf7f-93a0fdb17d72', 'f2dec7ab-c46c-4ada-b962-e41146830a8a', '2019-12-06 21:38:09', '1', '0', '0');
INSERT INTO `record` VALUES ('355b92a7-17b1-487f-a33b-fd32f590b794', '1e9b7ba7-530a-4254-ab53-2c8eec3dc095', '20aef80d-bb63-4328-b3ec-9825d489103f', '2019-12-07 00:11:35', '3', '1', '179');
INSERT INTO `record` VALUES ('36e5f8bc-d602-4e1a-87c6-e163aa02f1a9', 'e06b8b3b-7750-4472-bd88-fea0a0d5f5e1', 'f2dec7ab-c46c-4ada-b962-e41146830a8a', '2019-12-06 21:44:27', '1', '0', '0');
INSERT INTO `record` VALUES ('4472b89c-9430-43e2-b939-2af436deff95', 'e06b8b3b-7750-4472-bd88-fea0a0d5f5e1', '9226ba1e-8429-4663-8693-97b05c0954f3', '2019-12-06 21:45:24', '3', '1', '129');
INSERT INTO `record` VALUES ('449a3811-f821-4672-b3e1-51e5a470f08a', '1e9b7ba7-530a-4254-ab53-2c8eec3dc095', '48468b62-4ae4-40db-9cca-5b8c3d4e4dfb', '2019-12-06 21:15:42', '1', '0', '0');
INSERT INTO `record` VALUES ('45b2522c-538d-4b30-a93b-760914f45a0b', '007515b2-978a-41b3-b052-af5b06b6ea3c', '48468b62-4ae4-40db-9cca-5b8c3d4e4dfb', '2019-12-06 21:40:11', '1', '0', '0');
INSERT INTO `record` VALUES ('4ac1995e-4308-43e8-9ee9-0888cd8548cb', '1e9b7ba7-530a-4254-ab53-2c8eec3dc095', '20aef80d-bb63-4328-b3ec-9825d489103f', '2019-12-06 21:33:50', '3', '1', '179');
INSERT INTO `record` VALUES ('4dd81c61-e8fe-4553-ac1d-0f4dfac34dfb', '1e9b7ba7-530a-4254-ab53-2c8eec3dc095', '9226ba1e-8429-4663-8693-97b05c0954f3', '2019-12-06 21:23:14', '3', '1', '129');
INSERT INTO `record` VALUES ('53649857-1551-47ba-971c-7f9aeeb4b150', 'eafe9ff3-f65b-4f69-bf7f-93a0fdb17d72', 'c594025e-a76c-43e9-b677-8234260c5819', '2019-12-06 21:37:26', '1', '0', '0');
INSERT INTO `record` VALUES ('5acef4ae-705f-450c-a2e4-94de16d76531', '1e9b7ba7-530a-4254-ab53-2c8eec3dc095', 'f2dec7ab-c46c-4ada-b962-e41146830a8a', '2019-12-06 21:15:40', '1', '0', '0');
INSERT INTO `record` VALUES ('5ef6391b-3c02-4484-a799-9689195a960c', '1e9b7ba7-530a-4254-ab53-2c8eec3dc095', '20aef80d-bb63-4328-b3ec-9825d489103f', '2019-12-07 00:11:29', '1', '0', '0');
INSERT INTO `record` VALUES ('612d51d8-d15c-43be-8959-329491f735dd', '1e9b7ba7-530a-4254-ab53-2c8eec3dc095', '48468b62-4ae4-40db-9cca-5b8c3d4e4dfb', '2019-12-06 23:13:33', '3', '1', '199');
INSERT INTO `record` VALUES ('67d2582f-cf62-4f37-a7b5-5c8feee2218e', 'e06b8b3b-7750-4472-bd88-fea0a0d5f5e1', '9608ef94-eeb9-4b7f-aaad-f2918a5bf02e', '2019-12-06 21:44:22', '1', '0', '0');
INSERT INTO `record` VALUES ('6ad26c6c-dcd3-4db0-a80a-e635497f15ca', '1e9b7ba7-530a-4254-ab53-2c8eec3dc095', 'f2dec7ab-c46c-4ada-b962-e41146830a8a', '2019-12-06 21:15:55', '3', '1', '8888');
INSERT INTO `record` VALUES ('6bb7292a-063e-402b-925e-fff462da8041', 'eafe9ff3-f65b-4f69-bf7f-93a0fdb17d72', '9608ef94-eeb9-4b7f-aaad-f2918a5bf02e', '2019-12-06 21:38:14', '3', '1', '2299');
INSERT INTO `record` VALUES ('6f06042e-d751-4e3f-adfc-0ed009197a8f', 'eafe9ff3-f65b-4f69-bf7f-93a0fdb17d72', 'd9b5fda1-b46a-4507-a8c6-c5c48385ed1e', '2019-12-06 21:38:07', '1', '0', '0');
INSERT INTO `record` VALUES ('7050c5c0-638e-4ae9-a419-1e2757ac5c3e', 'e06b8b3b-7750-4472-bd88-fea0a0d5f5e1', 'f2dec7ab-c46c-4ada-b962-e41146830a8a', '2019-12-06 21:45:22', '3', '1', '8888');
INSERT INTO `record` VALUES ('7df13cca-ceea-4c8b-8e23-357d73ea2739', 'e06b8b3b-7750-4472-bd88-fea0a0d5f5e1', '48468b62-4ae4-40db-9cca-5b8c3d4e4dfb', '2019-12-06 21:45:27', '3', '1', '199');
INSERT INTO `record` VALUES ('7ff7669a-4a43-4df9-8f11-ec050bf4e183', 'eafe9ff3-f65b-4f69-bf7f-93a0fdb17d72', 'b0683161-4d3e-4c4b-86f6-514dbd86e880', '2019-12-06 21:38:02', '1', '0', '0');
INSERT INTO `record` VALUES ('80e4a134-d019-42e1-9c92-caec617801e5', '1e9b7ba7-530a-4254-ab53-2c8eec3dc095', '48468b62-4ae4-40db-9cca-5b8c3d4e4dfb', '2019-12-06 21:17:19', '3', '1', '199');
INSERT INTO `record` VALUES ('847dd56e-e0b2-4bd1-a617-7789cda9e8dc', '007515b2-978a-41b3-b052-af5b06b6ea3c', '9608ef94-eeb9-4b7f-aaad-f2918a5bf02e', '2019-12-06 21:40:13', '1', '0', '0');
INSERT INTO `record` VALUES ('86f981d1-6669-4381-a1cf-31787fae262c', '1e9b7ba7-530a-4254-ab53-2c8eec3dc095', '48468b62-4ae4-40db-9cca-5b8c3d4e4dfb', '2019-12-06 21:15:57', '3', '1', '199');
INSERT INTO `record` VALUES ('8a58c3c2-757f-4d5a-99d0-a87879e38042', '1e9b7ba7-530a-4254-ab53-2c8eec3dc095', '20aef80d-bb63-4328-b3ec-9825d489103f', '2019-12-06 21:15:56', '3', '1', '179');
INSERT INTO `record` VALUES ('965ac24f-cbef-405f-87b4-f7f7c6029e28', 'eafe9ff3-f65b-4f69-bf7f-93a0fdb17d72', 'b0683161-4d3e-4c4b-86f6-514dbd86e880', '2019-12-06 21:38:16', '3', '1', '1399');
INSERT INTO `record` VALUES ('980c0921-8e07-4646-ab14-092de027b518', 'e06b8b3b-7750-4472-bd88-fea0a0d5f5e1', 'f9180160-a5a7-42a2-8d81-852ab20a4a54', '2019-12-06 21:44:30', '1', '0', '0');
INSERT INTO `record` VALUES ('990052dd-073f-4ddd-b47f-4391348d8274', '1e9b7ba7-530a-4254-ab53-2c8eec3dc095', 'c594025e-a76c-43e9-b677-8234260c5819', '2019-12-06 21:15:25', '1', '0', '0');
INSERT INTO `record` VALUES ('a03a30e9-abdf-4b10-bb31-8503a5d2f2bf', '007515b2-978a-41b3-b052-af5b06b6ea3c', '9226ba1e-8429-4663-8693-97b05c0954f3', '2019-12-06 21:40:09', '1', '0', '0');
INSERT INTO `record` VALUES ('a37c601c-10e8-4a02-a1e5-e6cba576b3f9', 'eafe9ff3-f65b-4f69-bf7f-93a0fdb17d72', 'd9b5fda1-b46a-4507-a8c6-c5c48385ed1e', '2019-12-06 21:38:13', '3', '1', '2899');
INSERT INTO `record` VALUES ('ab6a0dfa-14bc-433c-b2eb-098ed2e3b013', 'e06b8b3b-7750-4472-bd88-fea0a0d5f5e1', '20aef80d-bb63-4328-b3ec-9825d489103f', '2019-12-06 21:44:59', '1', '0', '0');
INSERT INTO `record` VALUES ('ae50b57c-7977-4ad8-9b28-68bcdfa8beec', 'eafe9ff3-f65b-4f69-bf7f-93a0fdb17d72', '9608ef94-eeb9-4b7f-aaad-f2918a5bf02e', '2019-12-06 21:38:05', '1', '0', '0');
INSERT INTO `record` VALUES ('b0105578-f8a6-4501-b1f9-4829108e0cf5', '1e9b7ba7-530a-4254-ab53-2c8eec3dc095', '9226ba1e-8429-4663-8693-97b05c0954f3', '2019-12-06 21:23:04', '1', '0', '0');
INSERT INTO `record` VALUES ('b2b35f5b-6291-41f7-b216-053d66660510', 'e06b8b3b-7750-4472-bd88-fea0a0d5f5e1', 'c594025e-a76c-43e9-b677-8234260c5819', '2019-12-06 21:44:25', '1', '0', '0');
INSERT INTO `record` VALUES ('b2d32a8c-0664-4849-94e0-18444484a850', 'e06b8b3b-7750-4472-bd88-fea0a0d5f5e1', 'e9691487-4fe5-403f-bde4-71731799a548', '2019-12-06 21:44:29', '1', '0', '0');
INSERT INTO `record` VALUES ('bde16bc0-920f-40d7-8da0-d9896cb26805', 'e06b8b3b-7750-4472-bd88-fea0a0d5f5e1', 'd9b5fda1-b46a-4507-a8c6-c5c48385ed1e', '2019-12-06 21:45:30', '3', '1', '2899');
INSERT INTO `record` VALUES ('c32cb971-374b-4220-a891-9d58d8878714', 'eafe9ff3-f65b-4f69-bf7f-93a0fdb17d72', 'f2dec7ab-c46c-4ada-b962-e41146830a8a', '2019-12-06 21:38:17', '3', '1', '8888');
INSERT INTO `record` VALUES ('c665a1a1-d073-46df-80c8-edd132da81aa', '007515b2-978a-41b3-b052-af5b06b6ea3c', '48468b62-4ae4-40db-9cca-5b8c3d4e4dfb', '2019-12-06 21:40:19', '3', '1', '199');
INSERT INTO `record` VALUES ('c739f462-33e0-45e2-8fb2-b221e81579ee', '1e9b7ba7-530a-4254-ab53-2c8eec3dc095', '9226ba1e-8429-4663-8693-97b05c0954f3', '2019-12-06 21:15:56', '3', '2', '129');
INSERT INTO `record` VALUES ('ca3ec95d-f0cb-4105-afb6-ffac2766e222', 'eafe9ff3-f65b-4f69-bf7f-93a0fdb17d72', 'c594025e-a76c-43e9-b677-8234260c5819', '2019-12-06 21:37:32', '3', '1', '4999');
INSERT INTO `record` VALUES ('d0f537a1-a64d-40d2-a1c2-2a110ad39d1c', 'e06b8b3b-7750-4472-bd88-fea0a0d5f5e1', 'b0683161-4d3e-4c4b-86f6-514dbd86e880', '2019-12-06 21:44:23', '1', '0', '0');
INSERT INTO `record` VALUES ('d7ba79b5-b224-4766-b9aa-bd1cd706db08', 'e06b8b3b-7750-4472-bd88-fea0a0d5f5e1', '9608ef94-eeb9-4b7f-aaad-f2918a5bf02e', '2019-12-06 21:45:26', '3', '1', '2299');
INSERT INTO `record` VALUES ('d87689c9-f272-494c-bd99-1fd57fac16af', '1e9b7ba7-530a-4254-ab53-2c8eec3dc095', 'b0683161-4d3e-4c4b-86f6-514dbd86e880', '2019-12-06 21:15:36', '1', '0', '0');
INSERT INTO `record` VALUES ('d8f26724-5f87-4284-9a27-bf71ba880bfa', 'e06b8b3b-7750-4472-bd88-fea0a0d5f5e1', 'e9691487-4fe5-403f-bde4-71731799a548', '2019-12-06 21:45:35', '3', '1', '7899');
INSERT INTO `record` VALUES ('dcb6fb0b-5b92-404b-ac22-96142a31321f', 'e06b8b3b-7750-4472-bd88-fea0a0d5f5e1', 'd9b5fda1-b46a-4507-a8c6-c5c48385ed1e', '2019-12-06 21:44:26', '1', '0', '0');
INSERT INTO `record` VALUES ('de627168-5b13-44d4-a02f-537ad0cc62b5', '1e9b7ba7-530a-4254-ab53-2c8eec3dc095', 'c594025e-a76c-43e9-b677-8234260c5819', '2019-12-06 21:15:55', '3', '1', '4999');
INSERT INTO `record` VALUES ('e1d06ce5-ec88-497d-b24e-aa837dbd7a6d', 'e06b8b3b-7750-4472-bd88-fea0a0d5f5e1', '48468b62-4ae4-40db-9cca-5b8c3d4e4dfb', '2019-12-06 21:44:18', '1', '0', '0');
INSERT INTO `record` VALUES ('edc9c22b-e0d9-40af-8929-331b5ecced5e', '1e9b7ba7-530a-4254-ab53-2c8eec3dc095', 'f9180160-a5a7-42a2-8d81-852ab20a4a54', '2019-12-06 21:15:34', '1', '0', '0');
INSERT INTO `record` VALUES ('f30d6828-743f-4986-96c1-afde50b1f202', '1e9b7ba7-530a-4254-ab53-2c8eec3dc095', 'f9180160-a5a7-42a2-8d81-852ab20a4a54', '2019-12-06 21:15:56', '3', '1', '99');
INSERT INTO `record` VALUES ('f7c3831b-d4d0-4cef-84b7-a45f18414e25', 'e06b8b3b-7750-4472-bd88-fea0a0d5f5e1', 'b0683161-4d3e-4c4b-86f6-514dbd86e880', '2019-12-06 21:45:34', '3', '1', '1399');
INSERT INTO `record` VALUES ('f8516b43-df91-4ecb-b811-d44b3660c1f8', 'e06b8b3b-7750-4472-bd88-fea0a0d5f5e1', 'c594025e-a76c-43e9-b677-8234260c5819', '2019-12-06 21:45:33', '3', '1', '4999');
INSERT INTO `record` VALUES ('fbf6fc22-2978-4500-aa02-4878f6a23706', '1e9b7ba7-530a-4254-ab53-2c8eec3dc095', '20aef80d-bb63-4328-b3ec-9825d489103f', '2019-12-06 23:13:33', '3', '1', '179');
INSERT INTO `record` VALUES ('fc1ea66f-7884-4d88-ac68-f320b922ad1b', '1e9b7ba7-530a-4254-ab53-2c8eec3dc095', 'b0683161-4d3e-4c4b-86f6-514dbd86e880', '2019-12-06 21:15:56', '3', '1', '1399');
INSERT INTO `record` VALUES ('ffa34d0a-28c9-4b00-a120-7324cd9b7871', '007515b2-978a-41b3-b052-af5b06b6ea3c', '9226ba1e-8429-4663-8693-97b05c0954f3', '2019-12-06 21:40:17', '3', '1', '129');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `uNo` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `uId` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `uPwd` varchar(255) NOT NULL,
  `uName` varchar(255) NOT NULL,
  `uPost` varchar(255) NOT NULL,
  `uMoney` double NOT NULL,
  `uAddress` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`uNo`),
  UNIQUE KEY `uId` (`uId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('007515b2-978a-41b3-b052-af5b06b6ea3c', 'jianye', 'jianye', 'jianye', '786849871@qq.com', '97373', '');
INSERT INTO `user` VALUES ('1e9b7ba7-530a-4254-ab53-2c8eec3dc095', 'json', 'json', 'json', '1164849008@qq.com', '982915', '华南理工大学C12-705');
INSERT INTO `user` VALUES ('admin', 'admin', 'admin', '管理员', '1164849008@qq.com', '667861.64', '华南理工大学C12-705');
INSERT INTO `user` VALUES ('e06b8b3b-7750-4472-bd88-fea0a0d5f5e1', 'hoho', '123456', 'hoho', '123456@123.com', '9999970115', '');
INSERT INTO `user` VALUES ('eafe9ff3-f65b-4f69-bf7f-93a0fdb17d72', 'baobao', 'baobao', 'baobao', '773228130@qq.com', '79516', '');

-- ----------------------------
-- Procedure structure for addBrowsedRecord
-- ----------------------------
DROP PROCEDURE IF EXISTS `addBrowsedRecord`;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `addBrowsedRecord`(IN `uuNo` varchar(255),IN `ggNo` varchar(255),IN `ttime` datetime,IN `newrrNo` varchar(255))
BEGIN
	
	DECLARE rrNo VARCHAR(255) CHARACTER SET utf8;
	SELECT rNo INTO rrNo FROM record WHERE uNo = uuNo and gNo = ggNo and rType = 1;
	IF rrNo IS NULL THEN
	INSERT INTO record VALUES (newrrNo,uuNo,ggNo,ttime,1,0,0);
	ELSE
	UPDATE record
	SET rTime = ttime
	WHERE rNo = rrNo;
	END IF ;
	COMMIT;
END
;;
DELIMITER ;

-- ----------------------------
-- Procedure structure for addShoppingCar
-- ----------------------------
DROP PROCEDURE IF EXISTS `addShoppingCar`;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `addShoppingCar`(IN `newrrNo` varchar(255),IN `uuNo` varchar(255),IN `ggNo` varchar(255),IN `ttime` datetime)
BEGIN
	
	DECLARE rrNo VARCHAR(255) CHARACTER SET utf8;
	SELECT rNo INTO rrNo FROM record WHERE uNo = uuNo and gNo = ggNo and rType = 2;
	IF rrNo IS NULL THEN
	INSERT INTO record VALUES(newrrNo,uuNo,ggNo,ttime,2,1,0);
	ELSE
	UPDATE record
	SET gNum = gNum +1
	WHERE rrNo = rNo ;
	END IF;
END
;;
DELIMITER ;

-- ----------------------------
-- Procedure structure for buyOne
-- ----------------------------
DROP PROCEDURE IF EXISTS `buyOne`;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `buyOne`(IN `newrrNo` varchar(255),IN `uuNo` varchar(255),IN `ggNo` varchar(255),IN `ttime` datetime)
BEGIN
	
	DECLARE num int;
	DECLARE reserve INT;
	DECLARE exist INT;
	DECLARE money DOUBLE;
	SELECT gNum INTO num FROM record WHERE ggNo = gNo and uuNo = uNo and rType = 2;
	SELECT gReserve INTO reserve FROM goods WHERE gNo = ggNo ;
	IF `reserve` = -1 THEN
	SET exist = 4;
	ELSEIF reserve >= num THEN
	SELECT gMoney INTO money FROM goods WHERE ggNo = gNo;
	DELETE FROM record WHERE ggNo = gNo and uuNo = uNo and rType = 2;
	INSERT INTO record VALUES(newrrNo,uuNo,ggNo,ttime,3,num,money);
	UPDATE `user` SET `uMoney` = `uMoney` - `num`*`money` WHERE uuNo = uNo;
	UPDATE 	`user` SET `uMoney` = `uMoney` + `num`*`money` WHERE uId = 'admin';
	UPDATE 	`goods` SET `gReserve` = `gReserve` - `num` WHERE ggNo = gNo;
	SET exist = 1;
	ELSE 
	SET exist = 3;
	END IF ;
	SELECT exist;
	COMMIT;
END
;;
DELIMITER ;

-- ----------------------------
-- Procedure structure for changeGoods
-- ----------------------------
DROP PROCEDURE IF EXISTS `changeGoods`;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `changeGoods`(IN `ggNo` varchar(255),IN `ggName` varchar(255),IN `ggIntroduce` varchar(255),IN `ggMoney` double,IN `ggReserve` int,IN `ggDetail` varchar(255),IN `ggUrl` varchar(255),IN `ggUrl2` varchar(255))
BEGIN
	
	update goods set gName=ggName,gIntroduce=ggIntroduce,gMoney=ggMoney,gReserve=ggReserve,gDetail=ggDetail WHERE gNo = ggNo;
	IF ggUrl != '' THEN
	update goods set gUrl = ggUrl WHERE gNo = ggNo;
	END IF;
	IF ggUrl2 != '' THEN
	update goods set gUrl2 = ggUrl2 WHERE gNo = ggNo;
	END IF;
END
;;
DELIMITER ;

-- ----------------------------
-- Procedure structure for loadBroughtGoods
-- ----------------------------
DROP PROCEDURE IF EXISTS `loadBroughtGoods`;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `loadBroughtGoods`()
BEGIN
	
	SELECT g.gName gName,r.gMoney gMoney,count(r.gNum) gNum	,r.gNo gNo,g.gIntroduce gIntroduce,g.gDetail gDetail,g.gReserve gReserve
	FROM record r LEFT JOIN goods g on r.gNo = g.gNo  
	WHERE r.rType = 3
	GROUP BY r.gNo,r.gMoney;
END
;;
DELIMITER ;

-- ----------------------------
-- Procedure structure for loadCustomerInfo
-- ----------------------------
DROP PROCEDURE IF EXISTS `loadCustomerInfo`;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `loadCustomerInfo`()
BEGIN
	
	SELECT rTime, uName,rType,gName,gNum
	FROM record LEFT JOIN `user` on record.uNo = `user`.uNo LEFT JOIN goods ON record.gNo = goods.gNo
	WHERE `user`.uId != 'admin'
	ORDER BY rTime DESC;
END
;;
DELIMITER ;
