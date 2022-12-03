package com.adventOfcode.Event2022.Day3;

import java.util.Arrays;
import java.util.List;

public class Day3 {
    public static void main(String[] args) {

        List<String> inputList = Arrays.asList("WVHGHwddqSsNjsjwqVvdwZRCbcJcZTCcsZbLcJJsCZ", "hngprFFhFDFhrDpzzQDhtnBJJRJZbZvTcvbfRCJfBRcBJl", "DmptngtFwvvMmwmm", "HFddrJnLdqtHBMQBmmVm", "gbvNsbhsvQtmZTbQPT", "vDshDlczcDhcssscwzQwslLJrSJLpqrrzpnCrSfLSnqq", "pDGQDSpFDGzFDQSJqzDhjhQMTjTrwTstbTBTjTtLtbTMBT", "zgzVNHHgMwMLbLNB", "WRWPgdHCZccggJmJGzJmzGhGCD", "sVJNlhldShpdpnnwVnwCwtwggt", "WLFFcHWQLPPZQCgtnCgmbtbHwt", "MPLWzRMMcGgRrWNDpSSSfDflMlTd", "BBMZJcgBRjCZZzBpSvHQvbLvvHCQLQ", "VlVTFwDTVGnfWSQPtsDPbvrpDS", "wWdqhWlwGVfGwlfTVqFWfWWjzZZBJmMZMNdzZJMpjzNjgJ", "FBWFphQBmDmpmMSpDWVcVcvsPcRbrjPMcMsr", "HHtdnHnwNCHCTJRTPTzrbvVbcVRr", "lHqHwlnlqnGCNGGmWDvvZfpZvG", "mfVtmPtsccMmHcHCFfmhVmnpgZLbWPZqWnpqZbZWpgPW", "zzvwBrzdQDvpZJfQJZJpLf", "BrTBwRdNcfNmfStc", "sTlhFLfZTTLcfsLlLDZflvQvRNqRJFNvRMRNvQQRBQ", "CWcgwStWwCWWwvgNQvJBvQMQRB", "wptGzbzGWVGSCVVlVlLDcVVsfhLTlf", "HVnMVGwLLbsGnVsLnwLSBggMhjmgmgmhtmqhtgMhMj", "zrZzJRZfzZfrPCrFcWccPdTdHHlvdmlgTghCtmtTgq", "NFfcZWWzZrrHLBpBBGVGNG", "HqFhhCBCBLmwwCqJCHFvvFdcprrrSSrjRFRjpgrggb", "VGzWtQzGGQPVtlVNslVWsPdRpmcRrjpSzcrcbdSmSnSg", "WPPGllQMPGmTLvLJBCwM", "PvDWRSmTVvSvRhbZRpRpbjjjzM", "GBFGHLglHrrrLgGrttbMjpbcpcZJBsBp", "lrHgrrndgdNnlHGFQPMMmWPTvvWSCDQn", "mmhQShhmhQfzNfTTlShbHJrRtltltJJtHlRLLZ", "WscggNqwPWjcGcWWcpNcRJHHprZvZHrvtttZJpJr", "jGjgcMGCwPNsGDCcszBfhhQQQDnFnTVVBV", "mcGjrwzQcrZtQzZQDZcPssvPVVCPCVLwswwPBC", "NJbqHddNSgdPWvvsVHVLPs", "NqglNSlJFNSbSNdldNlNdNbTRFDrvRmQrQGtmDrvttQmmtDj", "zzcBPnHBjgHjWJvbJQTvScbwcQ", "qdspVCFqVqfFqLFCqtpTwtpTbSTbJpwBST", "FRLFRCNNqMfdWNmZPBPZrHmm", "VmtRRJmtrDrwhRcvPspltvgqtqsd", "WGQBZzMMBGBGbZTTWWCMNSgggqnPlsfbqndndccglffg", "CWQQZMFWdzMQdJJwJVFrwmmmRw", "rZsFfGfNhznzsjhzZfVjGVvVdvSTSJHSDDtcmmmttC", "wWpRBWlbWMWlQDvCcRSvJRSStm", "LPlwWqbgwqjjcFshNf", "lsppsGphmPrRQnvHdRpd", "qBgjLqMjgjTLPnzHPrPRLnzv", "gSMfNjNtttVbqBbtTSStjTqlhmlZDsDsbWZWFFFsGhlWPm", "sPDPDzrGzBsGRsbwrjtSVvthVfQtQw", "ClpgFZgNqMWCgqCpMNZqNWmNdtSwtljtVHQhtwfvdHtSdhSj", "FpNCJpNcpfCpgNWPGBLcbTGTzTzPnG", "mssNLCZqSqmNCHmrqHChJTjTjnRRnnqVnTTGngGTRn", "dbwptFwQbvdtcvpZDcDddgzGPjTGgpPTRpzzzgRzTn", "BwZdtZldDbrSsNrsrSHl", "MLnFWMRWpnpnLnLCmPGTqQsFzBttTQ", "SwNlDHNcddglSDBjrqmqGQqqmGtGGwszPP", "vdSlNcrvvvnBMbBR", "psZPRmTpRpgrlrDRBFgV", "jvCqNhwnjhGNqCMqVgFHWtgHBrtwHFrJ", "cGvbNcjvvhhjcvbQGcZdZSQpzdpmpPVpdZpd", "drTHDdlHzllZDTzTQRQLsPPSsBbSjQdL", "MfVVWmNvMnqNmVVpMMgfgMmvBFFfRRLQPPsPfsFLFCFRSFjR", "whMnNVnqWmlllHswJTZT", "ZSQTTLLlTsbmmDZlmNQSNFfPwHwqCjCCfjwFPwfwLr", "MctMJMBVttnhJcBBVctwRHjHRJwJwjFfqPfRwj", "vzqgqhBVzzTlZmmTlN", "WgvlHJFvljvdBmzcvcwpmchc", "TQqZsTZttLZbRZsLLMzzppBmNShCmBNTcNCN", "LPMZsMZLMQVgglFPhFHlFl", "qsBCPVPqVbwfnMQNmZJnqJgR", "hHdrvvLWtvtjWQnZJTMrmpTZgN", "DShSShLZdFGPGDPGsPsG", "qRBddRzFFqFqHnNnPSnnmmSpgpJm", "ssZDQMvvMwppNJWRDRpW", "MMvwlsRMcQBjcLqLBBqc", "ZGHpwFGvwpHrvfFTMtDfccMjntMntc", "RgSCLRLJRSRSQQqJmTDMPMTtsJjnclBjtj", "LVmmSSddLCwVHDbzDzZr", "psgWdsBjnnJjbZWQDDLNrDcrLVQjLM", "zPSCCHqCfqfmWNMcrVSLRM", "TPHzWPFTGztqTGgdJdsssvZgwb", "gcFgBChcClJjNCPb", "sWZdZdrSmWmSZRwSmsvPlsTtTtNMnnlvnJJv", "GSWrHZdGQpRrrSGmpWQmQfLfpVzDfghppzBVLBlBqg", "BFNqFzBNhqVwmTtsqVst", "dMwMwMfCMWbDtDvDssCC", "ldMwMSHHMMWJpRpPLLpBzPZjgnZPhN", "WczRJhcWggVBdzPPLnCjdvjm", "lSpSTpTSsCCmmntNdp", "wSFDCTwsGDqQqQVWWcJw", "RqPqhDGBhRDrrhBFmPmbgssZbwbgCbwsmZsQ", "nCtjMppjfTpjJJfVZwtzZtllLZwLss", "MHfpMWdHpSCSfnSTJWhDDFDFBGqDGvvDBDFd", "MCCGMCSHVGNTspVWQznddndg", "rttLtvRbrhLZrbcQdJnnQdfddsrggf", "BbRqltRtHsNNllNC", "ncFpcsLLdFmWlRmnllTR", "bMMVzVqMzjNVDblmRTPGlSmmPlqG", "gNDDJMVZNCbNJNDNQCbZCbscvBsdBvrRHfcpdQpfFFff", "VnWFbZvFbHWhFjZWVJZJLZFWTttpMCspQTTzQCHpgQMgztzT", "dGcfdNdGrlRlBDGNSllfBMspgzmTgtQQgztMtzpmcT", "lBNdqRsBRdfPNrLPFVVPVJPZZvhj", "TLWgggJzwjgWgjgGnnmQnzQfNNNQsm", "SpPbBlPBMlvFZpbbBmQGsmCJmCstsdNGBQ", "MhSHhZPrPbvSFrJPpPMSbMcLjjqTLHDRTDDTTLDLTqgH", "fprRRbbznFbcQVPDdQPdFV", "LTvmsLmcsHmvDvSZDZVVSS", "jWtmLccssJTLjHmLWWJwnwlBfwnBbllpCBnffbBr", "plPBWzbnFLPPtGqMMwlMGwmS", "ZQjDHjrQjdjVFwdMvCSfmwMqdt", "DDhhrRDjQghHJjhWBbgbTccbsTzpWF", "vgCbbwsTbWWWgwBWDGGDqtPGtMgGlFMH", "znrznJNhLSLphRRRDlFPMmpFPjjHtMFF", "llNcSQVSNcRbvCwwWcTdwZ", "qpnJbnRRnJhRFhFHRgQSzHlSRHCCCg", "fMBttBvsBjffvsQTtfGTWlCWsSgSmHCzZmLlHgzZ", "ffMdjrfdwjfwwnhJPFchhqwQ", "NCVSTCVCQCCRVDQSJsqFPsPNspFhhsgjPh", "btvtWtcWnpgmFhjmmt", "cfnffBfcWcrMdbvMQJDDrDTDVCpCDrGD", "fZNhBWFSlFQFjWQTTldHgCwvTvqqdr", "zznVzCznmHvnwgdH", "PMMbCGPMDPcLbJhFhWhBhRScQZBQ", "WQMrDWGHbSWHMNrTQRhghmgPZccmqDLwPqPg", "svCzfpdzzdsnslCsnPZcHZPlJcqZgmqPPc", "nntVpdpVsfjCHzvnsCzRTBrtWGbNNQSMbTNSRr", "SnpDQdBqGpDSBMfQGcMQBDJPNstvJcWNsPJCtJtNRWPC", "VrVHrhTHlPHTvvNtbhNRNswC", "TzlFHHmrVlgTlTGSzGqpdMGBPQBS", "zrCDnrDVCnCgnrHgGDnVVCZsNttQZmjtsmbMqGqsjbqj", "TlRRWPSwwFwbSwTTTpNQQqNjqZZlmMMQQt", "wvbwbRTLWdFFwvRBTbvTTRzrnznnJrDDCzBczBfHCJnz", "SvTdmLNNNdvTBmvmLvSvDpgczzjfgjggpcjcNPzD", "VJHQsJVlHpjjpzsjzP", "VRlJbJQrVbVHJJPMhBdnBRCSLZZZnvnLvv", "tMGcpGtMtLtsCGspLzNCBBmwCzQRzBBRWQ", "hdlHFllDdZgDbDDlDHTWWTnzBBBvzmNHzwRz", "FSddDlFRqDFqFSdPVqdhcfGMsVtVfLjrfGfjtMcs", "RGMWnBMWfCCMBHTDptJJgZStRPmSRD", "bqzFqjqcFLNLZZSmpSBgZZ", "rFrQNbNBlNcbrQlNQvvclMswTCTCnwrwHrWGsGCswn", "WLhJQddCQwRNCQNHczHNzMvZcZvcNc", "SlSpSlrpDqnbqDjlGjGGljTjMZZPPMMfVPgfHMMVgVvqfgcw", "SbGsDspbbnjTjBldCFmLwFCJLBmtJB", "TMDjMvMqMvDTzcmFCgrJCr", "ZZZJSZWVBHZWSSZQJhVhWnHJwczGGwGcCCFzwgmzcwFgwVzc", "pLHNQSnNJsMLRJds", "TsLZGwdsDFWHBZJFfZ", "mqhRvqrzJRbmzJBFfgHHgWgHrrlH", "JvvNhJmvtDdsNTwdLV", "wwnSVSmwtbstznwgbzzVMTNpTNWdlCSlSWTffWNCSN", "cFvccLGFGvvGHZflnNTpnZpZcB", "GPqGDhGGqrDhVRgbnbttPmgs", "rzSZJScLrcBLvjvsqMPZvjQl", "nnpDqgDqFTgwqHHvMHvvvTvPMM", "GnqCGpDqqVhccLmrmSmCRL", "tJSTmdfddDTDJCPmbQvQLHvqqqbrbvlP", "zWGsjcwwGGcVVjcGWcNjvNjQqrQtNFFQHHrF", "RZnRVsswRsGWcwVBZVtBRdDJgCffTgmgfnnCpfTfTM", "FnCrzhTrNPrMcnhMTnZZZNPwDPdbDmdDtwjdtjbmQwDt", "sBvWrpppvLBsLRVBfHSfbbQmbwSjStDSwSwS", "LVRRRJqqlHNlNTChrhMG", "WNsfsstMvtMvNNGPZwmZmqZPLWZcww", "rDCdDRCDFQjSVLcmZcDq", "bBBHqTgBbQlQRCQFbgqdhvshGvTJMnfTtnnThnsN", "VwWBTNQcVzDtrgfrtzzt", "LLbpShLGvlbCmLjpGSCSCpvFdrgdddcHtrtGgfqHcDHqrd", "pmvLmlpmjbLbpljJPBBcTBBQRZBBVJRZ", "cVTcVTNvvghNhvggPPgtCVSpSQmzCqZDRCmDZDZS", "dGJMWFsFMFWsnlzRlQzlzqpzlZzD", "HdLFssFMsJbnbFjqbhPgjNggcrhg", "LLVhQCTvRvmWlCppQfQQjPrwszNsfzNz", "BZSgncHgnJStJHJgntMWzGsrPqGwsfPfGPwwwZ", "bdBdJMBcShWCLbhWVC", "vjdpGNGwSNCTwwRbfnWgQMLjQWMnLQ", "DcmFPFtHmlcgpqWDnMbDLf", "FZJPtcprHtPPHplZHPZclwwGBSZSvSwCwvZzNdwvvw", "CdJLJCJPWPWcbtzJtqJzFrQvBhfjBBvjjvdjpFjr", "sBRgsZGDNSBBRGDwphrrrThpHpgHvhpQ", "DwDsGBDNwGmMNlMlMDSPmztJVCbVCCWqPqJLmW", "LSTMgDSRSMHbMDWLHSvDScwtCGqGrjGrcLftqVGtVC", "hzJPmlphCGrCwVrJ", "zhPNdNnQZBZBhZnNZSgMWMDbMHwWSDWNDH", "rcdvvcwvrHrMZBjHSZ", "sDtWblgnltsDFlgFqltCCVQTMTgSHVTfSQfSHj", "tDtRWFpFbWWWWNNDWsNqWvmzvhzhzGmzjjGvLwJmpc", "nFSSnnbhSfgLSSnVjdjfHMgfMzGzmqlNGGmTPlqqTzTNNzlT", "pBZsJJvccbBmlWGlNb", "cvsssvZwsDwrDdfFgnbDfVbgng", "mWRNWNCTdwdCwhCddbWWmhsZVgJQJBVBfsBsJQLQBLJb", "qFFlGzFtjjcqzHtFtlRfVfsZfQHVfBHQRHgf", "jqGjtcDnGnPzFRlzrnMdWrrCMMddNNWT", "MHWCjjGMcHhbhPDLphHQ", "nRVJrtgssdLgCppvLQbg", "RlVVZNVRJlsstldsBCNlczfjjSZmWTcmGmTSfmSm", "RTHqgTgMwgnGTRzqTHCGfdFdfhmBrJrdvbFJMhPB", "lNZNNNLttLWJBPBdZBFmdZ", "SppscpLVStclNPWtCczqnQQwHTTgCGwq", "hSHRCbZRSZhbRZBctnMVjwwtWtwh", "GrdFzQrDdJstjcWttwsF", "drPJLDPGPvDvzrJPQLdDHpZlwLgRmwCHLpwgSbff", "zMSSnCtCdSdCtdfMdHMdtVBDjhWDHBqbTVVBqhbDjr", "cPNhFFNRlNDlTBqjlTBG", "RvmvRpPNRgwgPvFwhmdCssmCzdMshMmL", "tttjgrpTwmCgCwgwrrlrHzbzqqFNzdJqqZnddJwNbh", "cQjMjPMBfcLBSjGQBndFnzNdNnhzzNGFbF", "sSQPLMfVPBVSfBMvVLSPfHCttDjCDRRtrVVglgpttD", "vdTvdpBvcTPdSSvCLrCCDLDCQGDl", "sRfnFgmFRMVsnqgRmqzmrrDBDwtHlLHtrLCDGL", "qRMVjJgRFnJfMssMsgZScPJpZbPbPPWhBZSp", "ZJgNJhGZglMZZFDTPSNqFSqTSb", "mwdvwpsjrcjBvpwFrvbHcDqbWHRWDSPWDHSR", "CsvpsLLjFzhlLGFZ", "sDNQrMrNfrlQjJRgGjbTllHG", "ZRhSnWFVSwBtFRBVvVgHgbzjgGTJnngmGmHC", "vWZLShhvZLVtSFSLqwVrQdqpcqMDddRNQMdsNP", "hQhSQbbwtHzShwhSQPbJRsLwRCjJmDCcvmqCcs", "FNdBTBTNMsRqqCjTjL", "GNdrdMBVFShhSLSGGL", "cZzcCmjjcvdzdWqgWTZgPZgZhh", "wSwVGSJFTffgJTNh", "FSVpVlBMShzbjzcpvp", "qqlblClRbnTvqTmRqlmnTwrdfdwFFNrngfddDBrNtr", "PcLcQLMVLGMzHLMchhLcjLFrrNrBfrfFNJtNgJDDBNzt", "sSjjGcGQscSVSMjHVMSVPSQsWmCmppZCmtCWbbWTlZTqTl", "qWlVJmDJHWJHVJlsdVTdhbFNNgFhwhhhFhwwZg", "npjnvQpStCQLvBpPnvtBtBpGSGbzbGDggGNbgwghzZNGGN", "jBvLtvjnrtMDmmDRTTrsWc", "pmwdwzJtFmmlpFsWwtstJPGgvNgCCLWCvPgNNPQCQv", "RfbfTRBnRGQvPNnncc", "ZTbPZSDSBfSBVSbbBRbbbtrFdtlFmVsswtFwzdpszw", "hVphQcmdcWWprWWhChFQBsfHjDTTBCHlSsTSBgSH", "vqBRqqzbqMZPMwSTDjJjlHDllgHZ", "PMnMLqtMnntQhWBccthB", "vqqvCSvHSSwqvqCddnvQFmNbVjbJVVmGNNVHNNlH", "pggrhzWgptWhZsmVlFmgNNVNbj", "RzpMLLhhphtzrRrSSbQTBQwSTDBwQM", "DSFQDlDFRddDHQHQtFlDVsVMTzrMCLSWZLZffSzLWrfCJz", "jjBBvpgmbppBPbMwBBBNbbZWZzzCCTzzZgzWcJccLzWz", "bvPwNwmpnBNhPmqpPvnwwNmtRQGQMdQDQlsGVVGhRlGFsl", "SfJJwDJgpGdSGJNSTwTVJDRbWWfLtCWCLtRLHWrtbWBf", "cQQPnFhjjQlczhqllhszhqsQRWnrbrHdHtbWrBWBbtvvHBrW", "qMqqqqzFFmPjmmsFjmzsmhjcDGSZTJgTdpZwZgwSZVpMTNVG", "czrcHMcMJtCCPnpFmH", "DwGGlvLljGmDRdwLdLjfhtFsssnFVpfttpptsnFPnp", "TlRTghTjwTDRTDlZZQgWMMrMJMSZmM", "BzdNzNdgNNPfgdNsdQdNvVMLLVQVMcCRCMRmvCGc", "zHpplwwZrZlqlWWrpZwqlHhLvqMCRDCGVmLcqGMVvCMmMD", "rWrjwWwHplZbwpZtHtJJbgfFTfsNnBbsfbSdTzgB", "jPRRppDLDGDTLLggMMjpLTGcrJWHsttJfwnWrMvrJnvnrNfJ", "blqbzBdzmhhbQWnsNHtJvfssfd", "lhFhzSzzSZVNSlVPgDPCPCGTRcGR", "cqWcNWffPftvsvfpqPtZsBzrbmbFddBmbcLbdDHbHz", "TJgljTnGgnLBTZbHdBFz", "JgSnJwSlgGJRwMtfPtvfwsZQZZtv", "hHhPbQPTwsdwdHqtgttjpNfjDt", "FFlCmSzRCCmlzzRGCFNvRpvjvtZNZqsRfNRg", "mVmsFMGFzJFBwQTMnMQndd", "QQVpQGcVdGmspHHLtbqfqfbt", "JvZTFDFzJzhFCWCZZDzWPBCJfLbnnwLqttnsHHNPwtbHLwjn", "DssTMWvvvGMcQGQGld", "sshRHZSZRbSZHhBFBMpMWpFgbbtb", "JfjTjmwwTPvfTNPTQlmFFFqqmFMBBqFgFt", "vDTvJffQTJjJvPvTNSHRzhCsShRRRDtZHz", "NFLsRDNNDNBDlgPPgBglQlzj", "HJhdZpfJzlWQjjHw", "ffJTppZZqTNlGnNsMG", "ZMrWcWwqqvPZMndGdqlnnDLnVT", "HpCsshCfpFfHHJDDSlSVQQGGflDQ", "zssNzRJFhjNHNNHpJRwbwMMzWWtZPcbBbwbG", "HlNHHLHsBDRpHLlsHRlJnMhfWZMRnvCCCnWhZj", "wtqSmQqttzSSQdPmmwZhChJjWJjPggCZCfZJ", "SSwtTbTQmbtdqmGTTcfqzDLHFsBLDGLNGrsBHFGrLB", "FFDvWznMWWMrPnPnWPgsmgQbhJRslHbwHwVVsVHjBsHb", "ZtSffffpdLqpSCLfCNqfLqLCjHjHbwhpBwJllHlRVQllphjj", "ZcNCtcGSctZScqfNGScLNcczPJFmzmDzGzWnrWFPFWDvrM", "DnTPspmTPsTCDQWRZzZzZRCRfCfHfh", "BNcqTBcFgbVchVJhVR", "dTwdrBrwTSPPWnnmSmsn", "pfbbDbHpNBFmQbpNNBSlLtlDStSdSPJLtLJR", "ZcszvwgVCZswFzVTRTlTlRLgRJSWJR", "jzZvVwFjcjjnwvzwZcjMpqMpbGQbQmhhHhmfHQmh", "hTbddhQCtdNmdtwtdhTBbCddRSWscczwcRSWLJzcFJzDsFsR", "NflgfPZPcgSLJcWD", "lPVNZMMMpZlZZvfrMvpbQHQhtbtqdTQHthrqhd", "JlWSStwhWJSRJpJvJBjTwTqcwTsDjsCTCB", "dqFzgFZGGQNVmTcCrjrzsBrB", "fdgLFQLnPdnqShRMPhlJMpWW", "TMPcsPDjdDhsDcDcTTTDvdvghBNFGGtmNrSrgSSBGNtNFg", "CVCbJqlRVVWWpRqRQZRWVWJZBtmSFGNmggGmtmmBFbrGMGMt", "JRqHVJVCRLZWTjMnfLTPcfLd", "TRTZFTTrghrZVhVWdWZpMmbzbdzBmtDpDDzmzB", "wcsSSsjfPfGPqQwqsQcfJJCtJGpppCBJzCbzJzCb", "sPjflcwljfjfvqNcTZTRhtVWrNrVLnrR", "rVLLsmwmCWTmsCTdwQrdTmqWDjDHjNGNPbjDBPNDNsZRDBjH", "cFcSvgJvfhfLnShtMJtPHRRvRbBBGBPNBHPbND", "hgLcgcLpJSMwzmrmzqQrmp");
        //Arrays.asList("vJrwpWtwJgWrhcsFMMfFFhFp", "jqHRNqRjqzjGDLGLrsFMfFZSrLrFZsSL", "PmmdzqPrVvPwwTWBwg", "wMqvLMZHhHMvwLHjbvcjnnSBnvTQFn", "ttgJtRGJQctTZtZT", "CrZsJsPPZsGzwwsLwLmpwMDw");
        System.out.println(rucksackSUm(inputList));
    }

    static int rucksackSUm(List<String> inputList) {

        int result = 0;
        for (int j = 0; j < inputList.size(); j = j + 3) {

            String firstHalf = inputList.get(j);
            String secondHalf = inputList.get(j + 1);
            String thirdHalf = inputList.get(j + 2);

            /*String firstHalf = input.substring(0, input.length() / 2);
            String secondHalf = input.substring(input.length() / 2);*/

            int[] firstHalfArray = new int[52];
            for (int i = 0; i < firstHalf.length(); i++) {
                char c = firstHalf.charAt(i);
                int index = 0;
                if (c > 96 && c < 123) {
                    index = c - 'a';
                } else if (c > 64 && c < 91) {
                    index = c - 'A' + 26;
                }
                firstHalfArray[index] = firstHalfArray[index] + 1;
            }
            int[] secondHalfArray = new int[52];
            for (int i = 0; i < secondHalf.length(); i++) {
                char c = secondHalf.charAt(i);
                int index = 0;
                if (c > 96 && c < 123) {
                    index = c - 'a';
                } else if (c > 64 && c < 91) {
                    index = c - 'A' + 26;
                }
                secondHalfArray[index] = secondHalfArray[index] + 1;
            }
            int[] thirdHalfArray = new int[52];
            for (int i = 0; i < thirdHalf.length(); i++) {
                char c = thirdHalf.charAt(i);
                int index = 0;
                if (c > 96 && c < 123) {
                    index = c - 'a';
                } else if (c > 64 && c < 91) {
                    index = c - 'A' + 26;
                }
                thirdHalfArray[index] = thirdHalfArray[index] + 1;
            }

            for (int i = 0; i < firstHalfArray.length; i++) {
                if (firstHalfArray[i] > 0 && secondHalfArray[i] > 0 && thirdHalfArray[i] > 0) {
                    result = result + i + 1;
                }
            }
        }
        return result;
    }
}
