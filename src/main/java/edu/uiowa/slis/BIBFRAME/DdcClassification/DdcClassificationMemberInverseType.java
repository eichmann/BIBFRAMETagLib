package edu.uiowa.slis.BIBFRAME.DdcClassification;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DdcClassificationMemberInverseType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static DdcClassificationMemberInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(DdcClassificationMemberInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DdcClassificationMemberInverseIterator theDdcClassificationMemberInverseIterator = (DdcClassificationMemberInverseIterator)findAncestorWithClass(this, DdcClassificationMemberInverseIterator.class);
			pageContext.getOut().print(theDdcClassificationMemberInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing DdcClassification for member tag ", e);
			throw new JspTagException("Error: Can't find enclosing DdcClassification for member tag ");
		}
		return SKIP_BODY;
	}
}

