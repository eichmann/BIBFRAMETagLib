package edu.uiowa.slis.BIBFRAME.Text;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TextIdentifiedBy extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static TextIdentifiedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(TextIdentifiedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TextIdentifiedByIterator theTextIdentifiedByIterator = (TextIdentifiedByIterator)findAncestorWithClass(this, TextIdentifiedByIterator.class);
			pageContext.getOut().print(theTextIdentifiedByIterator.getIdentifiedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing Text for identifiedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Text for identifiedBy tag ");
		}
		return SKIP_BODY;
	}
}

