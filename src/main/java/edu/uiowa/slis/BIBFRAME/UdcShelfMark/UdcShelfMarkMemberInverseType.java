package edu.uiowa.slis.BIBFRAME.UdcShelfMark;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class UdcShelfMarkMemberInverseType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static UdcShelfMarkMemberInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(UdcShelfMarkMemberInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			UdcShelfMarkMemberInverseIterator theUdcShelfMarkMemberInverseIterator = (UdcShelfMarkMemberInverseIterator)findAncestorWithClass(this, UdcShelfMarkMemberInverseIterator.class);
			pageContext.getOut().print(theUdcShelfMarkMemberInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing UdcShelfMark for member tag ", e);
			throw new JspTagException("Error: Can't find enclosing UdcShelfMark for member tag ");
		}
		return SKIP_BODY;
	}
}
