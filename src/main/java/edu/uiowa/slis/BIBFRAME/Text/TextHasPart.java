package edu.uiowa.slis.BIBFRAME.Text;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TextHasPart extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static TextHasPart currentInstance = null;
	private static final Log log = LogFactory.getLog(TextHasPart.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TextHasPartIterator theTextHasPartIterator = (TextHasPartIterator)findAncestorWithClass(this, TextHasPartIterator.class);
			pageContext.getOut().print(theTextHasPartIterator.getHasPart());
		} catch (Exception e) {
			log.error("Can't find enclosing Text for hasPart tag ", e);
			throw new JspTagException("Error: Can't find enclosing Text for hasPart tag ");
		}
		return SKIP_BODY;
	}
}

