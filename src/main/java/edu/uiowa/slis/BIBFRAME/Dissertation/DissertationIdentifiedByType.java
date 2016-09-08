package edu.uiowa.slis.BIBFRAME.Dissertation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DissertationIdentifiedByType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static DissertationIdentifiedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(DissertationIdentifiedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DissertationIdentifiedByIterator theDissertationIdentifiedByIterator = (DissertationIdentifiedByIterator)findAncestorWithClass(this, DissertationIdentifiedByIterator.class);
			pageContext.getOut().print(theDissertationIdentifiedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Dissertation for identifiedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dissertation for identifiedBy tag ");
		}
		return SKIP_BODY;
	}
}

