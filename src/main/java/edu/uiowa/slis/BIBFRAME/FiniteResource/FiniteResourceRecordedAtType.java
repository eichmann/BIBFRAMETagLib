package edu.uiowa.slis.BIBFRAME.FiniteResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FiniteResourceRecordedAtType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static FiniteResourceRecordedAtType currentInstance = null;
	private static final Log log = LogFactory.getLog(FiniteResourceRecordedAtType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FiniteResourceRecordedAtIterator theFiniteResourceRecordedAtIterator = (FiniteResourceRecordedAtIterator)findAncestorWithClass(this, FiniteResourceRecordedAtIterator.class);
			pageContext.getOut().print(theFiniteResourceRecordedAtIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing FiniteResource for recordedAt tag ", e);
			throw new JspTagException("Error: Can't find enclosing FiniteResource for recordedAt tag ");
		}
		return SKIP_BODY;
	}
}

