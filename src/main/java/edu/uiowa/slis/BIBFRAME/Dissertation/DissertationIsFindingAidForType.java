package edu.uiowa.slis.BIBFRAME.Dissertation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DissertationIsFindingAidForType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static DissertationIsFindingAidForType currentInstance = null;
	private static final Log log = LogFactory.getLog(DissertationIsFindingAidForType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DissertationIsFindingAidForIterator theDissertationIsFindingAidForIterator = (DissertationIsFindingAidForIterator)findAncestorWithClass(this, DissertationIsFindingAidForIterator.class);
			pageContext.getOut().print(theDissertationIsFindingAidForIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Dissertation for isFindingAidFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dissertation for isFindingAidFor tag ");
		}
		return SKIP_BODY;
	}
}

