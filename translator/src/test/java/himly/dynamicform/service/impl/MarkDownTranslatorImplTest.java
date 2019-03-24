package himly.dynamicform.service.impl;

import himly.dynamicform.service.MarkDownTranslator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * @author himly
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MarkDownTranslatorImplTest {

    @Autowired
    private MarkDownTranslator markDownTranslator;

    @Test
    public void transform() {
        String json = "[\n" +
                "      {\n" +
                "        \"key\": \"declareType\",\n" +
                "        \"placeHolder\": \"\",\n" +
                "        \"label\": \"申报类型\",\n" +
                "        \"type\": \"Enum\",\n" +
                "        \"notNull\": true,\n" +
                "        \"enums\": [\n" +
                "          {\n" +
                "            \"label\": \"预申报\",\n" +
                "            \"value\":\"ADVANCE_DECLARATION\"\n" +
                "          },\n" +
                "          {\n" +
                "            \"label\": \"申报\",\n" +
                "            \"value\": \"DECLARE\"\n" +
                "          }\n" +
                "        ],\n" +
                "        \"custom\": [],\n" +
                "        \"tags\": []\n" +
                "      },\n" +
                "      {\n" +
                "        \"key\": \"visitArea\",\n" +
                "        \"placeHolder\": \"\",\n" +
                "        \"label\": \"出访地区\",\n" +
                "        \"type\": \"Enum\",\n" +
                "        \"notNull\": true,\n" +
                "        \"enums\": [\n" +
                "          {\n" +
                "            \"label\": \"港澳\",\n" +
                "            \"value\": \"HK_OR_MACAO\"\n" +
                "          },\n" +
                "          {\n" +
                "            \"label\": \"台湾\",\n" +
                "            \"value\": \"TAIWAN\"\n" +
                "          },\n" +
                "          {\n" +
                "            \"label\": \"国外\",\n" +
                "            \"value\": \"FOREIGN\"\n" +
                "          }\n" +
                "        ],\n" +
                "        \"custom\": [],\n" +
                "        \"tags\": []\n" +
                "      },\n" +
                "      {\n" +
                "        \"key\": \"departureTime\",\n" +
                "        \"placeHolder\": \"\",\n" +
                "        \"label\": \"出境时间\",\n" +
                "        \"type\": \"Date\",\n" +
                "        \"notNull\": true,\n" +
                "        \"enums\": [\n" +
                "          {\n" +
                "            \"label\": \"港澳\",\n" +
                "            \"value\": \"HK_OR_MACAO\"\n" +
                "          },\n" +
                "          {\n" +
                "            \"label\": \"台湾\",\n" +
                "            \"value\": \"TAIWAN\"\n" +
                "          },\n" +
                "          {\n" +
                "            \"label\": \"国外\",\n" +
                "            \"value\": \"FOREIGN\"\n" +
                "          }\n" +
                "        ],\n" +
                "        \"custom\": [],\n" +
                "        \"tags\": []\n" +
                "      },\n" +
                "      {\n" +
                "        \"key\": \"entryTime\",\n" +
                "        \"placeHolder\": \"\",\n" +
                "        \"label\": \"入境时间\",\n" +
                "        \"type\": \"Date\",\n" +
                "        \"notNull\": true,\n" +
                "        \"enums\": [\n" +
                "          {\n" +
                "            \"label\": \"港澳\",\n" +
                "            \"value\": \"HK_OR_MACAO\"\n" +
                "          },\n" +
                "          {\n" +
                "            \"label\": \"台湾\",\n" +
                "            \"value\": \"TAIWAN\"\n" +
                "          },\n" +
                "          {\n" +
                "            \"label\": \"国外\",\n" +
                "            \"value\": \"FOREIGN\"\n" +
                "          }\n" +
                "        ],\n" +
                "        \"custom\": [],\n" +
                "        \"tags\": []\n" +
                "      },\n" +
                "      {\n" +
                "        \"key\": \"purposeOfVisit\",\n" +
                "        \"placeHolder\": \"\",\n" +
                "        \"label\": \"出访目的\",\n" +
                "        \"type\": \"String\",\n" +
                "        \"notNull\": true,\n" +
                "        \"enums\": [\n" +
                "          {\n" +
                "            \"label\": \"港澳\",\n" +
                "            \"value\": \"HK_OR_MACAO\"\n" +
                "          },\n" +
                "          {\n" +
                "            \"label\": \"台湾\",\n" +
                "            \"value\": \"TAIWAN\"\n" +
                "          },\n" +
                "          {\n" +
                "            \"label\": \"国外\",\n" +
                "            \"value\": \"FOREIGN\"\n" +
                "          }\n" +
                "        ],\n" +
                "        \"custom\": [],\n" +
                "        \"tags\": []\n" +
                "      },\n" +
                "      {\n" +
                "        \"key\": \"visitCountriesInfo\",\n" +
                "        \"placeHolder\": \"\",\n" +
                "        \"label\": \"出访国家信息\",\n" +
                "        \"type\": \"Set<Custom>\",\n" +
                "        \"notNull\": true,\n" +
                "        \"enums\": [],\n" +
                "        \"custom\": [\n" +
                "          {\n" +
                "            \"key\": \"visitCountryName\",\n" +
                "            \"placeHolder\": \"\",\n" +
                "            \"label\": \"出访国家名称\",\n" +
                "            \"type\": \"String\",\n" +
                "            \"notNull\": true,\n" +
                "            \"enums\": [],\n" +
                "            \"custom\": [],\n" +
                "            \"tags\": []\n" +
                "          },\n" +
                "          {\n" +
                "            \"key\": \"visitAreaName\",\n" +
                "            \"placeHolder\": \"\",\n" +
                "            \"label\": \"出访地区\",\n" +
                "            \"type\": \"String\",\n" +
                "            \"notNull\": true,\n" +
                "            \"enums\": [],\n" +
                "            \"custom\": [],\n" +
                "            \"tags\": []\n" +
                "          },\n" +
                "          {\n" +
                "            \"key\": \"visitCityName\",\n" +
                "            \"placeHolder\": \"\",\n" +
                "            \"label\": \"出访城市\",\n" +
                "            \"type\": \"String\",\n" +
                "            \"notNull\": true,\n" +
                "            \"enums\": [],\n" +
                "            \"custom\": [],\n" +
                "            \"tags\": []\n" +
                "          },\n" +
                "          {\n" +
                "            \"key\": \"areasDesc\",\n" +
                "            \"placeHolder\": \"\",\n" +
                "            \"label\": \"途经地\",\n" +
                "            \"type\": \"String\",\n" +
                "            \"notNull\": false,\n" +
                "            \"enums\": [],\n" +
                "            \"custom\": [],\n" +
                "            \"tags\": []\n" +
                "          },\n" +
                "          {\n" +
                "            \"key\": \"visitType\",\n" +
                "            \"placeHolder\": \"\",\n" +
                "            \"label\": \"出访类型\",\n" +
                "            \"type\": \"Enum\",\n" +
                "            \"notNull\": true,\n" +
                "            \"enums\": [\n" +
                "              {\n" +
                "                \"label\": \"友好访问\",\n" +
                "                \"value\": \"FRIENDLY_VISIT\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"label\": \"国际会议\",\n" +
                "                \"value\": \"INTERNATIONAL_CONFERENCE\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"label\": \"国际竞赛\",\n" +
                "                \"value\": \"INTERNATIONAL_COMPETITION\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"label\": \"海外科研\",\n" +
                "                \"value\": \"OVERSEAS_RESEARCH\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"label\": \"海外授课\",\n" +
                "                \"value\": \"TEACHING_ABROAD\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"label\": \"访问学者\",\n" +
                "                \"value\": \"VISIT_SCHOLAR\"\n" +
                "              }\n" +
                "            ],\n" +
                "            \"custom\": [],\n" +
                "            \"tags\": []\n" +
                "          },\n" +
                "          {\n" +
                "            \"key\": \"visitTime\",\n" +
                "            \"placeHolder\": \"\",\n" +
                "            \"label\": \"出访时间\",\n" +
                "            \"type\": \"Date\",\n" +
                "            \"enums\": [],\n" +
                "            \"notNull\": true,\n" +
                "            \"custom\": [],\n" +
                "            \"tags\": []\n" +
                "          },\n" +
                "          {\n" +
                "            \"key\": \"departmentOfInviteBy\",\n" +
                "            \"placeHolder\": \"\",\n" +
                "            \"label\": \"邀请单位\",\n" +
                "            \"type\": \"String\",\n" +
                "            \"notNull\": true,\n" +
                "            \"enums\": [],\n" +
                "            \"custom\": [],\n" +
                "            \"tags\": []\n" +
                "          },\n" +
                "          {\n" +
                "            \"key\": \"inviterName\",\n" +
                "            \"placeHolder\": \"\",\n" +
                "            \"label\": \"邀请人姓名\",\n" +
                "            \"type\": \"String\",\n" +
                "            \"notNull\": false,\n" +
                "            \"enums\": [],\n" +
                "            \"custom\": [],\n" +
                "            \"tags\": []\n" +
                "          },\n" +
                "          {\n" +
                "            \"key\": \"inviterJob\",\n" +
                "            \"placeHolder\": \"\",\n" +
                "            \"label\": \"邀请人职务\",\n" +
                "            \"type\": \"String\",\n" +
                "            \"notNull\": false,\n" +
                "            \"enums\": [],\n" +
                "            \"custom\": [],\n" +
                "            \"tags\": []\n" +
                "          }\n" +
                "        ],\n" +
                "        \"tags\": []\n" +
                "      },\n" +
                "      {\n" +
                "        \"key\": \"schedules\",\n" +
                "        \"placeHolder\": \"\",\n" +
                "        \"label\": \"行程安排\",\n" +
                "        \"type\": \"Set<Custom>\",\n" +
                "        \"notNull\": true,\n" +
                "        \"enums\": [],\n" +
                "        \"custom\": [\n" +
                "          {\n" +
                "            \"key\": \"date\",\n" +
                "            \"placeHolder\": \"\",\n" +
                "            \"label\": \"日期\",\n" +
                "            \"type\": \"Date\",\n" +
                "            \"notNull\": true,\n" +
                "            \"enums\": [],\n" +
                "            \"custom\": [],\n" +
                "            \"tags\": []\n" +
                "          },\n" +
                "          {\n" +
                "            \"key\": \"country\",\n" +
                "            \"placeHolder\": \"\",\n" +
                "            \"label\": \"国家\",\n" +
                "            \"type\": \"String\",\n" +
                "            \"notNull\": true,\n" +
                "            \"enums\": [],\n" +
                "            \"custom\": [],\n" +
                "            \"tags\": []\n" +
                "          },\n" +
                "          {\n" +
                "            \"key\": \"area\",\n" +
                "            \"placeHolder\": \"\",\n" +
                "            \"label\": \"地区\",\n" +
                "            \"type\": \"String\",\n" +
                "            \"notNull\": true,\n" +
                "            \"enums\": [],\n" +
                "            \"custom\": [],\n" +
                "            \"tags\": []\n" +
                "          },\n" +
                "          {\n" +
                "            \"key\": \"todaySchedule\",\n" +
                "            \"placeHolder\": \"\",\n" +
                "            \"label\": \"今日安排\",\n" +
                "            \"type\": \"String\",\n" +
                "            \"notNull\": true,\n" +
                "            \"enums\": [],\n" +
                "            \"custom\": [],\n" +
                "            \"tags\": []\n" +
                "          }\n" +
                "        ],\n" +
                "        \"tags\": []\n" +
                "      },\n" +
                "      {\n" +
                "        \"key\": \"visitMembers\",\n" +
                "        \"placeHolder\": \"\",\n" +
                "        \"label\": \"出访成员\",\n" +
                "        \"type\": \"Set<Custom>\",\n" +
                "        \"notNull\": true,\n" +
                "        \"enums\": [],\n" +
                "        \"custom\": [\n" +
                "          {\n" +
                "            \"key\": \"memberNature\",\n" +
                "            \"placeHolder\": \"\",\n" +
                "            \"label\": \"成员性质\",\n" +
                "            \"type\": \"Enum\",\n" +
                "            \"notNull\": true,\n" +
                "            \"enums\": [\n" +
                "              {\n" +
                "                \"label\": \"校内\",\n" +
                "                \"value\": \"ON_CAMPUS\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"label\": \"校外\",\n" +
                "                \"value\": \"OFF_CAMPUS\"\n" +
                "              }\n" +
                "            ],\n" +
                "            \"custom\": [],\n" +
                "            \"tags\": []\n" +
                "          },\n" +
                "          {\n" +
                "            \"key\": \"name\",\n" +
                "            \"placeHolder\": \"\",\n" +
                "            \"label\": \"成员姓名\",\n" +
                "            \"type\": \"String\",\n" +
                "            \"notNull\": true,\n" +
                "            \"enums\": [],\n" +
                "            \"custom\": [],\n" +
                "            \"tags\": []\n" +
                "          },\n" +
                "          {\n" +
                "            \"key\": \"PositionWithinTheGroup\",\n" +
                "            \"placeHolder\": \"\",\n" +
                "            \"label\": \"团内职务\",\n" +
                "            \"type\": \"Enum\",\n" +
                "            \"notNull\": true,\n" +
                "            \"enums\": [\n" +
                "              {\n" +
                "                \"label\": \"团长\",\n" +
                "                \"value\": \"HEAD\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"label\": \"副团长\",\n" +
                "                \"value\": \"DEPUTY_HEAD\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"label\": \"成员\",\n" +
                "                \"value\": \"MEMBER\"\n" +
                "              }\n" +
                "            ],\n" +
                "            \"custom\": [],\n" +
                "            \"tags\": []\n" +
                "          },\n" +
                "          {\n" +
                "            \"key\": \"workPlace\",\n" +
                "            \"placeHolder\": \"\",\n" +
                "            \"label\": \"工作单位\",\n" +
                "            \"type\": \"String\",\n" +
                "            \"notNull\": true,\n" +
                "            \"enums\": [],\n" +
                "            \"custom\": [],\n" +
                "            \"tags\": []\n" +
                "          },\n" +
                "          {\n" +
                "            \"key\": \"position\",\n" +
                "            \"placeHolder\": \"\",\n" +
                "            \"label\": \"职务\",\n" +
                "            \"type\": \"String\",\n" +
                "            \"notNull\": true,\n" +
                "            \"enums\": [],\n" +
                "            \"custom\": [],\n" +
                "            \"tags\": []\n" +
                "          },\n" +
                "          {\n" +
                "            \"key\": \"jobNumber\",\n" +
                "            \"placeHolder\": \"\",\n" +
                "            \"label\": \"工号\",\n" +
                "            \"type\": \"String\",\n" +
                "            \"notNull\": true,\n" +
                "            \"enums\": [],\n" +
                "            \"custom\": [],\n" +
                "            \"tags\": []\n" +
                "          }\n" +
                "        ],\n" +
                "        \"tags\": []\n" +
                "      },\n" +
                "      {\n" +
                "        \"key\": \"fundDetails\",\n" +
                "        \"placeHolder\": \"\",\n" +
                "        \"label\": \"经费情况\",\n" +
                "        \"type\": \"Set<Custom>\",\n" +
                "        \"notNull\": true,\n" +
                "        \"enums\": [],\n" +
                "        \"custom\": [\n" +
                "          {\n" +
                "            \"key\": \"typeOfUse\",\n" +
                "            \"placeHolder\": \"\",\n" +
                "            \"label\": \"经费用途\",\n" +
                "            \"type\": \"Enum\",\n" +
                "            \"notNull\": true,\n" +
                "            \"enums\": [\n" +
                "              {\n" +
                "                \"label\": \"国际旅费\",\n" +
                "                \"value\": \"INTERNATIONAL_TRAVEL_EXPENSES\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"label\": \"住宿费\",\n" +
                "                \"value\": \"ACCOMMODATION_FEE\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"label\": \"伙食费\",\n" +
                "                \"value\": \"FOOD_EXPENSES\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"label\": \"城市间交通费\",\n" +
                "                \"value\": \"TRANSPORTATION_FEE\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"label\": \"公杂费\",\n" +
                "                \"value\": \"PUBLIC_FEE\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"label\": \"其他\",\n" +
                "                \"value\": \"OTHER\"\n" +
                "              }\n" +
                "            ],\n" +
                "            \"custom\": [],\n" +
                "            \"tags\": []\n" +
                "          },\n" +
                "          {\n" +
                "            \"key\": \"fundSource\",\n" +
                "            \"placeHolder\": \"\",\n" +
                "            \"label\": \"经费来源\",\n" +
                "            \"type\": \"Enum\",\n" +
                "            \"notNull\": true,\n" +
                "            \"enums\": [\n" +
                "              {\n" +
                "                \"label\": \"项目方支付\",\n" +
                "                \"value\": \"PROJECT_SIDE_PAY\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"label\": \"邀请方支付\",\n" +
                "                \"value\": \"INVITER_PAY\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"label\": \"自费\",\n" +
                "                \"value\": \"SELF_PAY\"\n" +
                "              }\n" +
                "            ],\n" +
                "            \"custom\": [],\n" +
                "            \"tags\": []\n" +
                "          },\n" +
                "          {\n" +
                "            \"key\": \"budgetAmount\",\n" +
                "            \"placeHolder\": \"\",\n" +
                "            \"label\": \"预算金额\",\n" +
                "            \"type\": \"String\",\n" +
                "            \"notNull\": true,\n" +
                "            \"enums\": [],\n" +
                "            \"custom\": [],\n" +
                "            \"tags\": []\n" +
                "          },\n" +
                "          {\n" +
                "            \"key\": \"fundSourceNotes\",\n" +
                "            \"placeHolder\": \"\",\n" +
                "            \"label\": \"资金来源备注\",\n" +
                "            \"type\": \"String\",\n" +
                "            \"notNull\": true,\n" +
                "            \"enums\": [],\n" +
                "            \"custom\": [],\n" +
                "            \"tags\": []\n" +
                "          }\n" +
                "        ],\n" +
                "        \"tags\": []\n" +
                "      },\n" +
                "      {\n" +
                "        \"key\": \"invitationCards\",\n" +
                "        \"placeHolder\": \"\",\n" +
                "        \"label\": \"邀请函\",\n" +
                "        \"type\": \"Set<String>\",\n" +
                "        \"notNull\": true,\n" +
                "        \"enums\": [],\n" +
                "        \"custom\": [],\n" +
                "        \"tags\": []\n" +
                "      },\n" +
                "      {\n" +
                "        \"key\": \"translatedInvitationCards\",\n" +
                "        \"placeHolder\": \"\",\n" +
                "        \"label\": \"邀请函翻译件\",\n" +
                "        \"type\": \"Set<String>\",\n" +
                "        \"notNull\": false,\n" +
                "        \"enums\": [],\n" +
                "        \"custom\": [],\n" +
                "        \"tags\": []\n" +
                "      }\n" +
                "    ]";


        String content = markDownTranslator.transformToTable(json, "Project fields");
        System.out.println(content);
    }
}