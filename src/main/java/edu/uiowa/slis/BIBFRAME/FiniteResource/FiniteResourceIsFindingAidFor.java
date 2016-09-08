package edu.uiowa.slis.BIBFRAME.FiniteResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FiniteResourceIsFindingAidFor extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static FiniteResourceIsFindingAidFor currentInstance = null;
	private static final Log log = LogFactory.getLog(FiniteResourceIsFindingAidFor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FiniteResourceIsFindingAidForIterator theFiniteResourceIsFindingAidForIterator = (FiniteResourceIsFindingAidForIterator)findAncestorWithClass(this, FiniteResourceIsFindingAidForIterator.class);
			pageContext.getOut().print(theFiniteResourceIsFindingAidForIterator.getIsFindingAidFor());
		} catch (Exception e) {
			log.error("Can't find enclosing FiniteResource for isFindingAidFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing FiniteResource for isFindingAidFor tag ");
		}
		return SKIP_BODY;
	}
}

