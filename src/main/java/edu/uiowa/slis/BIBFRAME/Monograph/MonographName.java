package edu.uiowa.slis.BIBFRAME.Monograph;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MonographName extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MonographName currentInstance = null;
	private static final Log log = LogFactory.getLog(MonographName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			MonographNameIterator theMonograph = (MonographNameIterator)findAncestorWithClass(this, MonographNameIterator.class);
			pageContext.getOut().print(theMonograph.getName());
		} catch (Exception e) {
			log.error("Can't find enclosing Monograph for name tag ", e);
			throw new JspTagException("Error: Can't find enclosing Monograph for name tag ");
		}
		return SKIP_BODY;
	}
}

