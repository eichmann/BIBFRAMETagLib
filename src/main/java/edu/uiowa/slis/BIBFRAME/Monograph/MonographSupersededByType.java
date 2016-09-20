package edu.uiowa.slis.BIBFRAME.Monograph;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MonographSupersededByType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MonographSupersededByType currentInstance = null;
	private static final Log log = LogFactory.getLog(MonographSupersededByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MonographSupersededByIterator theMonographSupersededByIterator = (MonographSupersededByIterator)findAncestorWithClass(this, MonographSupersededByIterator.class);
			pageContext.getOut().print(theMonographSupersededByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Monograph for supersededBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Monograph for supersededBy tag ");
		}
		return SKIP_BODY;
	}
}

