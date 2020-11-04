package com.example.pushsumpleandroidkotlin;

/**
 * SharedPreferencesで保持するキーを保持します
 * Created by imagawa on 15/06/16.
 */
public class PreferenceKey {
    public static final String PREFERENCES_FILE = "postme_pref";

    public static final String PREFERENCES_FILE_FEVER_TIME = "pref_fever_time";

    public static final String PREFERENCES_FILE_ENTERING_MESSAGE = "pref_entering_message";

    public static final String PREFERENCES_FILE_TUTORIAL = "pref_tutorial";

    /**
     * アプリのバージョンコード
     */
    public static final String PREFERENCES_KEY_VERSION_CODE = "version_code";

    /**
     * ユーザーデータ
     */
    public static final String PREFERENCES_KEY_USER_DATA = "user_data";

    /**
     * 自身のユーザートークン
     */
    public static final String PREFERENCES_KEY_USER_TOKEN = "user_token";

    /**
     * 都道府県データ
     */
    public static final String PREFERENCES_KEY_PREFECTURE_DATA = "prefecture_data";

    /**
     * レビューされているか
     */
    public static final String PREFERENCES_KEY_IS_REVIEWED = "is_reviewed";

    /**
     * レビューダイアログを表示した日時
     */
    public static final String PREFERENCES_KEY_REVIEW_DIALOG_DISPLAY_DATE = "review_dialog_display_date";

    /**
     * プロフィールを完成済みか
     */
    public static final String PREFERENCES_KEY_IS_COMPLETED_PROFILE = "is_completed_profile";

    /**
     * 初投稿ボーナスを受け取り済みか
     */
    public static final String PREFERENCES_KEY_IS_COMPLETED_FIRST_BOARD_BONUS = "is_completed_first_board_bonus";

    /**
     * 'プロフィール登録'または'データ引き継ぎ'した日時
     */
    public static final String PREFERENCES_KEY_LOGIN_DATE = "login_date";

    /**
     * 最後にデイリーログインボーナスを取得した日時
     */
    public static final String PREFERENCES_KEY_LAST_DAILY_BONUS_RECEIVE_DATE = "last_daily_bonus_receive_date";

    /**
     * 最後に掲示板に投稿した日時
     */
    public static final String PREFERENCES_KEY__LAST_POST_BOARD_MESSAGE_DATE = "last_post_doard_message_date";

    /**
     * 最後に場所ごとのニュースを表示した日時
     */
    public static final String PREFERENCES_KEY_LAST_SHOWED_NEWS_DATE_BY_LOC = "last_showed_news_date_by_loc";

    /**
     * これ以降、場所ごとのニュースを表示しないか否かを保存するキー
     */
    public static final String PREFERENCES_KEY_NEWS_NO_DISPLAY_BY_ID = "preferences_key_news_no_display_by_id:";

    /**
     * プッシュ通知が有効であるか
     */
    public static final String PREFERENCES_KEY_IS_ENABLE_PUSH = "is_enable_push";

    /**
     * メール通知が有効であるか
     */
    public static final String PREFERENCES_KEY_IS_ENABLE_PUSH_MAIL = "is_enable_push_mail";

    /**
     * いいね通知が有効であるか
     */
    public static final String PREFERENCES_KEY_IS_ENABLE_PUSH_FAVORITE = "is_enable_push_favorite";

    /**
     * 足あと通知が有効であるか
     */
    public static final String PREFERENCES_KEY_IS_ENABLE_PUSH_FOOTPRINT = "is_enable_push_footprint";

    /**
     * その他通知が有効であるか
     */
    public static final String PREFERENCES_KEY_IS_ENABLE_PUSH_OTHER = "is_enable_push_other";

    /**
     * プッシュ通知に画像をつけるか否か
     */
    public static final String PREFERENCES_KEY_IS_ENABLE_PUSH_WITH_IMAGE = "is_enable_push_with_image";

    /**
     * バイブが有効であるか
     */
    public static final String PREFERENCES_KEY_IS_ENABLE_VIBRATE = "is_enable_vibrate";

    /**
     * メール一覧を未読優先で取得するか
     */
    public static final String PREFERENCES_KEY_IS_ENABLE_ORDER_BY_UNREAD = "is_enable_order_by_unread";

    /**
     * 未読メールを優先で設定するアナウンスダイアログを表示したか
     */
    public static final String PREFERENCES_KEY_IS_SHOWN_ORDER_BY_UNREAD_DIALOG = "is_shown_order_by_unread_dialog";

    /**
     * 最後にスタビのサーバーに送信したGCM Registration Token
     */
    public static final String PREFERENCES_KEY_LAST_SEND_GCM_TOKEN_TO_SERVER = "last_send_gcm_reg_token";

    /**
     * 課金中エラーが発生しているかどうか
     */
    public static final String PREFERENCES_KEY_IS_PURCHASE_UNCOMPLETED = "is_purchase_uncompleted";


    /**
     * TOP画面で最後に検索した県ID
     */
    public static final String PREFERENCES_KEY_TOP_ACT_LAST_SEARCH_PREFECTURE_ID = "top_act_last_search_prefecture_id";

    /**
     * TOP画面で最後に検索したエリアID
     */
    public static final String PREFERENCES_KEY_TOP_ACT_LAST_SEARCH_AREA_ID = "top_act_last_search_area_id";


    /**
     * 探す画面で最後に検索した県ID
     */
    public static final String PREFERENCES_KEY_SEARCH_ACT_LAST_SEARCH_PREFECTURE_ID = "search_act_last_search_prefecture_id";

    /**
     * 探す画面で最後に検索したエリアID
     */
    public static final String PREFERENCES_KEY_SEARCH_ACT_LAST_SEARCH_AREA_ID = "search_act_last_search_area_id";

    /**
     * コミュニティ画面で最後に検索した県ID
     */
    public static final String PREFERENCES_KEY_COMMUNITY_ACT_LAST_SEARCH_PREFECTURE_ID = "community_act_last_search_prefecture_id";

    /**
     * コミュニティ画面で最後に検索したエリアID
     */
    public static final String PREFERENCES_KEY_COMMUNITY_ACT_LAST_SEARCH_AREA_ID = "community_act_last_search_area_id";

    /**
     * メール一覧画面のヘルプダイアログを非表示にする設定がされているか
     */
    public static final String PREFERENCES_KEY_MAIL_LIST_NO_DISPLAY_HELP_DIALOG = "mail_list_no_display_help_dialog";

    /**
     * メール一覧画面のヘルプダイアログを最後に表示した時間
     */
    public static final String PREFERENCES_KEY_MAIL_LIST_DISPLAY_HELP_DIALOG_TIME = "mail_list_display_help_dialog_time";


    /**
     * さがす画面のヘルプダイアログを非表示にする設定がされているか
     */
    public static final String PREFERENCES_KEY_SEARCH_NO_DISPLAY_HELP_DIALOG = "search_no_display_help_dialog";

    /**
     * さがす画面のヘルプダイアログを最後に表示した時間
     */
    public static final String PREFERENCES_KEY_SEARCH_DISPLAY_HELP_DIALOG_TIME = "search_display_help_dialog_time";

    /**
     * さがす画面を開いたことがあるか
     */
    public static final String PREFERENCES_KEY_SEARCH_IS_OPENED = "search_is_opened";


    /**
     * TOP画面のヘルプダイアログを非表示にする設定がされているか
     */
    public static final String PREFERENCES_KEY_TOP_NO_DISPLAY_HELP_DIALOG = "top_no_display_help_dialog";

    /**
     * TOP画面のヘルプダイアログを最後に表示した時間
     */
    public static final String PREFERENCES_KEY_TOP_DISPLAY_HELP_DIALOG_TIME = "top_display_help_dialog_time";


    /**
     * あしあと画面のヘルプダイアログを非表示にする設定がされているか
     */
    public static final String PREFERENCES_KEY_FOOTPRINT_NO_DISPLAY_HELP_DIALOG = "footprint_no_display_help_dialog";

    /**
     * あしあと画面のヘルプダイアログを最後に表示した時間
     */
    public static final String PREFERENCES_KEY_FOOTPRINT_DISPLAY_HELP_DIALOG_TIME = "footprint_display_help_dialog_time";


    /**
     * ユーザー画面のヘルプダイアログを非表示にする設定がされているか
     */
    public static final String PREFERENCES_KEY_USER_NO_DISPLAY_HELP_DIALOG = "user_no_display_help_dialog";

    /**
     * ユーザー画面のヘルプダイアログを最後に表示した時間
     */
    public static final String PREFERENCES_KEY_USER_DISPLAY_HELP_DIALOG_TIME = "user_display_help_dialog_time";

    /**
     * 年齢確認が必要かどうか
     */
    public static final String PREFERENCES_KEY_NEEDS_AGE_VERIFICATION = "needs_age_verification";

    /**
     * 通話受信可能フラグ
     */
    public static final String PREFERENCES_KEY_IS_CALL_PHONE_PERMIT = "is_call_phone_permit";
    /**
     * ビデオ通話受信可能フラグ
     */
    public static final String PREFERENCES_KEY_IS_VIDEO_CALL_PERMIT = "is_video_call_permit";

    /**
     * 通話一時保存データ：秒数
     */
    public static final String PREFERENCES_KEY_TEMP_CALL_PHONE_HISTORY_SECONDS = "temp_call_phone_history_seconds";

    /**
     * 通話一時保存データ：CallPhoneID
     */
    public static final String PREFERENCES_KEY_TEMP_CALL_PHONE_HISTORY_ID = "temp_call_phone_history_id";


    /**
     * 通話可能ユーザー一覧画面のヘルプダイアログを非表示にする設定がされているか
     */
    public static final String PREFERENCES_KEY_CALL_PHONE_AVAIL_LIST_NO_DISPLAY_HELP_DIALOG = "call_phone_avail_list_no_display_help_dialog";

    /**
     * 通話可能ユーザー一覧画面のヘルプダイアログを最後に表示した時間
     */
    public static final String PREFERENCES_KEY_CALL_PHONE_AVAIL_LIST_DISPLAY_HELP_DIALOG_TIME = "call_phone_avail_list_display_help_dialog_time";

    /**
     * 通話可能ユーザー一覧画面で最後に検索した県ID
     */
    public static final String PREFERENCES_KEY_CALL_PHONE_AVAIL_LIST_LAST_SEARCH_PREFECTURE_ID = "call_phone_avail_list_last_search_prefecture_id";

    /**
     * 通話可能ユーザー一覧画面で最後に検索したエリアID
     */
    public static final String PREFERENCES_KEY_CALL_PHONE_AVAIL_LIST_LAST_SEARCH_AREA_ID = "call_phone_avail_list_last_search_area_id";

    /**
     * 通話可能ユーザー一覧画面を開いたことがあるか
     */
    public static final String PREFERENCES_KEY_CALL_PHONE_AVAIL_LIST_IS_OPENED = "call_phone_avail_list_is_opened";

    /**
     * ミッション機能が有効かどうか
     */
    public static final String PREFERENCES_KEY_AVAILABLE_MISSION = "available_mission";

    /**
     * イメージリクエスト機能が有効かどうか
     */
    public static final String PREFERENCES_KEY_AVAILABLE_IMAGE_REQUEST = "available_image_request";

    /**
     * 紹介コード入力ダイアログを表示するためのフラグ
     * ユーザー登録が完了したタイミングでONになり、紹介コード入力ダイアログを閉じるタイミングでOFFになる。
     * ONになったままアプリが起動した場合はダイアログが中断されたとみなし、トップ画面でもう一度ダイアログを表示する。
     */
    public static final String PREFERENCES_KEY_SHOW_REGISTER_INVITATION_CODE_DIALOG = "show_register_invitation_code_dialog";

    /**
     * 強制的にプロフ項目を入力させるダイアログを表示するか否かのフラグ
     */
    public static final String PREFERENCES_KEY_SHOW_FORCED_REGISTER_DIALOG = "show_forced_register_dislog";

    /**
     * 友達紹介画面へ遷移するためのバナーに表記する文言（ストア画面とその他画面で表示）
     */
    public static final String PREFERENCES_KEY_INVITATION_BANNER_MESSAGE = "invitation_banner_message";

    /**
     * 友達招待ボーナスを受け取れるユーザーに表示する文言(スタビではストア画面で表示)
     */
    public static final String PREFERENCES_KEY_CAN_GET_INVITEE_REWARD_MESSAGE = "can_get_invitee_reward_message";

    /**
     * 広告削除フラグ
     */
    public static final String PREFERENCES_KEY_REMOVE_ADS = "remove_ads";

    /**
     * コミュニティのカテゴリ情報
     */
    public static final String PREFERENCES_KEY_COMMUNITY_CATEGORY_DATA = "community_category_data";

    /**
     * 年齢認証の状態(0=未承認 1=承認待ち 2=承認済み)
     */
    public static final String PREFERENCES_KEY_AGE_VERIFICATION_STATUS = "age_verification_status";

    /**
     * APIドメイン
     */
    public static final String PREFERENCES_KEY_API_DOMAIN = "api_domain";

    /**
     * 生年月日を変更したことがあるか
     */
    public static final String PREFERENCES_KEY_CHANGED_BIRTHDAY = "changed_birthday";

    /**
     * 初投稿ダイアログを表示した日時
     */
    public static final String PREFERENCES_KEY_LAST_DISPLAY_FIRST_BOARD_MESSAGE_DIALOG = "PREFERENCES_KEY_LAST_DISPLAY_FIRST_BOARD_MESSAGE_DIALOG";

    /**
     * フィーバータイム情報
     */
    public static final String PREFERENCES_KEY_FEVER_TIME_INFO = "PREFERENCES_KEY_FEVER_TIME_INFO";

    /**
     * フィーバータイムプッシュ送信設定時刻
     */
    public static final String PREFERENCES_KEY_FEVER_TIME_SEND_PUSH_TIME = "PREFERENCES_KEY_FEVER_TIME_SEND_PUSH_TIME";

    /**
     * フィーバータイムダイアログ表示時刻
     */
    public static final String PREFERENCES_KEY_FEVER_TIME_DISPLAY_DIALOG_TIME = "PREFERENCES_KEY_FEVER_TIME_DISPLAY_DIALOG_TIME";

    /**
     * 一日にいいねを送信できる最大回数
     */
    public static final String PREFERENCES_KEY_THRESHOLD_LIKE_COUNT = "PREFERENCES_KEY_THRESHOLD_LIKE_COUNT";

    /**
     * 最後にいいねを送信した時刻
     */
    public static final String PREFERENCES_KEY_LAST_SEND_LIKE_DATE = "PREFERENCES_KEY_LAST_SEND_LIKE_DATE";

    /**
     * 1日にいいねを送信した回数
     */
    public static final String PREFERENCES_KEY_SEND_LIKE_COUNT = "PREFERENCES_KEY_SEND_LIKE_COUNT";

    /**
     * 一日にあいさつメールを送信できる最大回数
     */
    public static final String PREFERENCES_KEY_THRESHOLD_GREETING_COUNT = "PREFERENCES_KEY_THRESHOLD_GREETING_COUNT";

    /**
     * 最後にあいさつメールを送信した時刻
     */
    public static final String PREFERENCES_KEY_LAST_SEND_GREETING_DATE = "PREFERENCES_KEY_LAST_SEND_GREETING_DATE";

    /**
     * 1日にあいさつメールを送信した回数
     */
    public static final String PREFERENCES_KEY_SEND_GREETING_COUNT = "PREFERENCES_KEY_SEND_GREETING_COUNT";

    /**
     * プロフィール写真が承認済みか否か
     */
    public static final String PREFERENCES_KEY_PROFILE_IS_APPROVAL = "PREFERENCES_KEY_PROFILE_IS_APPROVAL";

    /**
     * 自作定型文
     */
    public static final String PREFERENCES_KEY_TEMPLATE_MESSAGE = "PREFERENCES_KEY_TEMPLATE_MESSAGE";

    /**
     * 申請前に受け取ったメッセージ数(申請の際に確認)
     */
    public static final String PREFERENCES_KEY_RECEIVED_MESSAGE_COUNT = "PREFERENCES_KEY_RECEIVED_MESSAGE_COUNT";

    /**
     * メール詳細画面にて入力中だったメッセージ(後ろにユーザーIDをつけて使用)
     */
    public static final String PREFERENCES_KEY_ENTERING_MESSAGE = "PREFERENCES_KEY_ENTERING_MESSAGE:";

    /**
     * サーバーから取得したチュートリアルのマスターデータ
     */
    public static final String PREFERENCES_KEY_TUTORIAL_MASTER_DATA = "TUTORIAL_MASTER_DATA";

    /**
     * チュートリアルの進捗状況
     */
    public static final String PREFERENCES_KEY_TUTORIAL_CURRENT_NUM = "TUTORIAL_CURRENT_NUM:";

    /**
     * チュートリアルスワイプいいねを行うか否か
     */
    public static final String PREFERENCES_KEY_SHOW_TUTORIAL_SWIPE_WINK = "SHOW_TUTORIAL_SWIPE_WINK";

    /**
     * チュートリアルBINGOのチュートリアル
     */
    public static final String PREFERENCES_KEY_SHOW_TUTORIAL_TUTORIAL_BINGO = "SHOW_TUTORIAL_TUTORIAL_BINGO";

    /**
     * 初回フロー終了時の処理を行うか否か
     */
    public static final String PREFERENCES_KEY_SHOW_TUTORIAL_FINISH = "SHOW_TUTORIAL_FINISH";

    /**
     * お気に入り登録したことのあるユーザー
     */
    public static final String PREFERENCES_KEY_TUTORIAL_ALREADY_FAVORITE_USER = "ALREADY_FAVORITE_USER_ID:";

    /**
     * 返信したことのあるユーザー
     */
    public static final String PREFERENCES_KEY_TUTORIAL_ALREADY_REPLY_USER = "ALREADY_REPLY_USER_ID:";

    /**
     * チュートリアルが使用可能かどうか
     */
    public static final String PREFERENCES_KEY_AVAILABLE_TUTORIAL = "AVAILABLE_TUTORIAL";

    /**
     * チュートリアル機能が使用できるバージョンが有るとき、何時からチュートリアル機能が使えるか
     */
    public static final String PREFERENCES_KEY_AVAILABLE_TUTORIAL_DATE = "AVAILABLE_TUTORIAL_DATE";

    /**
     * チュートリアル達成後、報酬を受け取っていないチュートリアル項目に対して、ダイアログを表示したか否か
     */
    public static final String PREFERENCES_KEY_IS_SHOWED_DIALOG_OF_TUTORIAL_ACHIEVED_BUT_NOT_RECEIVE = "IS_SHOWED_DIALOG_OF_TUTORIAL_ACHIEVED_BUT_NOT_RECEIVE:";

    /**
     * いいねスワイプを最後に起動した日時
     */
    public static final String PREFERENCES_KEY_SWIPE_WINK_INIT_DATE = "SWIPE_WINK_INIT_DATE";

    /**
     * いいねスワイプの情報を保持するKEY
     */
    public static final String PREFERENCES_KEY_SWIPE_WINK_USER_IDS_LOADER_RESULT = "SWIPE_WINK_USER_IDS_LOADER_RESULT";

    /**
     * スワイプアクションのINDEXを保存するKEY
     */
    public static final String PREFERENCES_KEY_SWIPE_ACTION_INDEX = "SWIPE_ACTION_INDEX:";
    /**
     * スワイプアクションのActionNumを保存するKEY
     */
    public static final String PREFERENCES_KEY_SWIPE_ACTION_NUM = "SWIPE_ACTION_NUM:";

    /**
     * アプリを起動した時刻
     */
    public static final String PREFERENCES_KEY_LAUNCH_APP_DATE = "LAUNCH_APP_DATE";

    /**
     * ギフトのIDを保持
     */
    public static final String PREFERENCES_KEY_GIFT_ID = "GIFT_ID";

    /**
     * ギフトが承認時のバッジを表示するか否か
     */
    public static final String PREFERENCES_KEY_GIFT_IS_APPROVED = "GIFT_IS_APPROVED";

    /**
     * プッシュ通知のメール受信
     */
    public static final String PREFERENCES_KEY_PUSH_ID = "PUSH_ID";
}
