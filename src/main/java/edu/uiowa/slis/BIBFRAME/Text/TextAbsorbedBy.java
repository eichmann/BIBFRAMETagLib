package edu.uiowa.slis.BIBFRAME.Text;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TextAbsorbedBy extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static TextAbsorbedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(TextAbsorbedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TextAbsorbedByIterator theTextAbsorbedByIterator = (TextAbsorbedByIterator)findAncestorWithClass(this, TextAbsorbedByIterator.class);
			pageContext.getOut().print(theTextAbsorbedByIterator.getAbsorbedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing Text for absorbedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Text for absorbedBy tag ");
		}
		return SKIP_BODY;
	}
}

