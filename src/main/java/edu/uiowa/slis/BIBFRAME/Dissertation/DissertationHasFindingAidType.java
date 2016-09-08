package edu.uiowa.slis.BIBFRAME.Dissertation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DissertationHasFindingAidType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static DissertationHasFindingAidType currentInstance = null;
	private static final Log log = LogFactory.getLog(DissertationHasFindingAidType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DissertationHasFindingAidIterator theDissertationHasFindingAidIterator = (DissertationHasFindingAidIterator)findAncestorWithClass(this, DissertationHasFindingAidIterator.class);
			pageContext.getOut().print(theDissertationHasFindingAidIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Dissertation for hasFindingAid tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dissertation for hasFindingAid tag ");
		}
		return SKIP_BODY;
	}
}

