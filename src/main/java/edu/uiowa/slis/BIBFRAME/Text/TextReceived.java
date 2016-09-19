package edu.uiowa.slis.BIBFRAME.Text;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TextReceived extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static TextReceived currentInstance = null;
	private static final Log log = LogFactory.getLog(TextReceived.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TextReceivedIterator theTextReceivedIterator = (TextReceivedIterator)findAncestorWithClass(this, TextReceivedIterator.class);
			pageContext.getOut().print(theTextReceivedIterator.getReceived());
		} catch (Exception e) {
			log.error("Can't find enclosing Text for received tag ", e);
			throw new JspTagException("Error: Can't find enclosing Text for received tag ");
		}
		return SKIP_BODY;
	}
}

