package edu.uiowa.slis.BIBFRAME.FiniteResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FiniteResourceIsFindingAidForType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static FiniteResourceIsFindingAidForType currentInstance = null;
	private static final Log log = LogFactory.getLog(FiniteResourceIsFindingAidForType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FiniteResourceIsFindingAidForIterator theFiniteResourceIsFindingAidForIterator = (FiniteResourceIsFindingAidForIterator)findAncestorWithClass(this, FiniteResourceIsFindingAidForIterator.class);
			pageContext.getOut().print(theFiniteResourceIsFindingAidForIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing FiniteResource for isFindingAidFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing FiniteResource for isFindingAidFor tag ");
		}
		return SKIP_BODY;
	}
}

