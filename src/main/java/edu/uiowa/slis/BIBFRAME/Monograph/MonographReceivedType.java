package edu.uiowa.slis.BIBFRAME.Monograph;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MonographReceivedType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MonographReceivedType currentInstance = null;
	private static final Log log = LogFactory.getLog(MonographReceivedType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MonographReceivedIterator theMonographReceivedIterator = (MonographReceivedIterator)findAncestorWithClass(this, MonographReceivedIterator.class);
			pageContext.getOut().print(theMonographReceivedIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Monograph for received tag ", e);
			throw new JspTagException("Error: Can't find enclosing Monograph for received tag ");
		}
		return SKIP_BODY;
	}
}

