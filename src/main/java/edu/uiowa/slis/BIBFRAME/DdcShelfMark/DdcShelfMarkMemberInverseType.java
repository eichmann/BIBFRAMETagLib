package edu.uiowa.slis.BIBFRAME.DdcShelfMark;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DdcShelfMarkMemberInverseType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static DdcShelfMarkMemberInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(DdcShelfMarkMemberInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DdcShelfMarkMemberInverseIterator theDdcShelfMarkMemberInverseIterator = (DdcShelfMarkMemberInverseIterator)findAncestorWithClass(this, DdcShelfMarkMemberInverseIterator.class);
			pageContext.getOut().print(theDdcShelfMarkMemberInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing DdcShelfMark for member tag ", e);
			throw new JspTagException("Error: Can't find enclosing DdcShelfMark for member tag ");
		}
		return SKIP_BODY;
	}
}

