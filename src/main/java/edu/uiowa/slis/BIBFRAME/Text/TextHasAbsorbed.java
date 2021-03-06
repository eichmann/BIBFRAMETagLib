package edu.uiowa.slis.BIBFRAME.Text;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TextHasAbsorbed extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static TextHasAbsorbed currentInstance = null;
	private static final Log log = LogFactory.getLog(TextHasAbsorbed.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TextHasAbsorbedIterator theTextHasAbsorbedIterator = (TextHasAbsorbedIterator)findAncestorWithClass(this, TextHasAbsorbedIterator.class);
			pageContext.getOut().print(theTextHasAbsorbedIterator.getHasAbsorbed());
		} catch (Exception e) {
			log.error("Can't find enclosing Text for hasAbsorbed tag ", e);
			throw new JspTagException("Error: Can't find enclosing Text for hasAbsorbed tag ");
		}
		return SKIP_BODY;
	}
}

