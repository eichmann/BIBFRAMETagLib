package edu.uiowa.slis.BIBFRAME.Monograph;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MonographIsUnionOf extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MonographIsUnionOf currentInstance = null;
	private static final Log log = LogFactory.getLog(MonographIsUnionOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MonographIsUnionOfIterator theMonographIsUnionOfIterator = (MonographIsUnionOfIterator)findAncestorWithClass(this, MonographIsUnionOfIterator.class);
			pageContext.getOut().print(theMonographIsUnionOfIterator.getIsUnionOf());
		} catch (Exception e) {
			log.error("Can't find enclosing Monograph for isUnionOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Monograph for isUnionOf tag ");
		}
		return SKIP_BODY;
	}
}

