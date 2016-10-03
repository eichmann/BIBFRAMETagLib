package edu.uiowa.slis.BIBFRAME.UdcClassification;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class UdcClassificationMemberInverseType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static UdcClassificationMemberInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(UdcClassificationMemberInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			UdcClassificationMemberInverseIterator theUdcClassificationMemberInverseIterator = (UdcClassificationMemberInverseIterator)findAncestorWithClass(this, UdcClassificationMemberInverseIterator.class);
			pageContext.getOut().print(theUdcClassificationMemberInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing UdcClassification for member tag ", e);
			throw new JspTagException("Error: Can't find enclosing UdcClassification for member tag ");
		}
		return SKIP_BODY;
	}
}

