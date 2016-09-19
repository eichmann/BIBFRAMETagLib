package edu.uiowa.slis.BIBFRAME.Monograph;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MonographRelationInverse extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MonographRelationInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(MonographRelationInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MonographRelationInverseIterator theMonographRelationInverseIterator = (MonographRelationInverseIterator)findAncestorWithClass(this, MonographRelationInverseIterator.class);
			pageContext.getOut().print(theMonographRelationInverseIterator.getRelationInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Monograph for relation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Monograph for relation tag ");
		}
		return SKIP_BODY;
	}
}

