package edu.uiowa.slis.BIBFRAME.Monograph;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MonographSupersededBy extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MonographSupersededBy currentInstance = null;
	private static final Log log = LogFactory.getLog(MonographSupersededBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MonographSupersededByIterator theMonographSupersededByIterator = (MonographSupersededByIterator)findAncestorWithClass(this, MonographSupersededByIterator.class);
			pageContext.getOut().print(theMonographSupersededByIterator.getSupersededBy());
		} catch (Exception e) {
			log.error("Can't find enclosing Monograph for supersededBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Monograph for supersededBy tag ");
		}
		return SKIP_BODY;
	}
}

