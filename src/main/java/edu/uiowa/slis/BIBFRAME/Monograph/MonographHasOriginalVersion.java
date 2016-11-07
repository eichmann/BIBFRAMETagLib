package edu.uiowa.slis.BIBFRAME.Monograph;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MonographHasOriginalVersion extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MonographHasOriginalVersion currentInstance = null;
	private static final Log log = LogFactory.getLog(MonographHasOriginalVersion.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MonographHasOriginalVersionIterator theMonographHasOriginalVersionIterator = (MonographHasOriginalVersionIterator)findAncestorWithClass(this, MonographHasOriginalVersionIterator.class);
			pageContext.getOut().print(theMonographHasOriginalVersionIterator.getHasOriginalVersion());
		} catch (Exception e) {
			log.error("Can't find enclosing Monograph for hasOriginalVersion tag ", e);
			throw new JspTagException("Error: Can't find enclosing Monograph for hasOriginalVersion tag ");
		}
		return SKIP_BODY;
	}
}
