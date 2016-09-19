package edu.uiowa.slis.BIBFRAME.Audience;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudienceAudienceInverseType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static AudienceAudienceInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(AudienceAudienceInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AudienceAudienceInverseIterator theAudienceAudienceInverseIterator = (AudienceAudienceInverseIterator)findAncestorWithClass(this, AudienceAudienceInverseIterator.class);
			pageContext.getOut().print(theAudienceAudienceInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Audience for audience tag ", e);
			throw new JspTagException("Error: Can't find enclosing Audience for audience tag ");
		}
		return SKIP_BODY;
	}
}

