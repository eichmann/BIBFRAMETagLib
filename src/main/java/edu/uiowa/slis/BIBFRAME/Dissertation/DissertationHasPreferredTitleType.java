package edu.uiowa.slis.BIBFRAME.Dissertation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DissertationHasPreferredTitleType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static DissertationHasPreferredTitleType currentInstance = null;
	private static final Log log = LogFactory.getLog(DissertationHasPreferredTitleType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DissertationHasPreferredTitleIterator theDissertationHasPreferredTitleIterator = (DissertationHasPreferredTitleIterator)findAncestorWithClass(this, DissertationHasPreferredTitleIterator.class);
			pageContext.getOut().print(theDissertationHasPreferredTitleIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Dissertation for hasPreferredTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dissertation for hasPreferredTitle tag ");
		}
		return SKIP_BODY;
	}
}

