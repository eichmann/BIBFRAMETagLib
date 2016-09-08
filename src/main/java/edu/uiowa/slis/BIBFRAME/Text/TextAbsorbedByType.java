package edu.uiowa.slis.BIBFRAME.Text;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TextAbsorbedByType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static TextAbsorbedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(TextAbsorbedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TextAbsorbedByIterator theTextAbsorbedByIterator = (TextAbsorbedByIterator)findAncestorWithClass(this, TextAbsorbedByIterator.class);
			pageContext.getOut().print(theTextAbsorbedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Text for absorbedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Text for absorbedBy tag ");
		}
		return SKIP_BODY;
	}
}

