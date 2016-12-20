package edu.uiowa.slis.BIBFRAME.TemporalEntity;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TemporalEntityRelationInverse extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static TemporalEntityRelationInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(TemporalEntityRelationInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TemporalEntityRelationInverseIterator theTemporalEntityRelationInverseIterator = (TemporalEntityRelationInverseIterator)findAncestorWithClass(this, TemporalEntityRelationInverseIterator.class);
			pageContext.getOut().print(theTemporalEntityRelationInverseIterator.getRelationInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing TemporalEntity for relation tag ", e);
			throw new JspTagException("Error: Can't find enclosing TemporalEntity for relation tag ");
		}
		return SKIP_BODY;
	}
}

