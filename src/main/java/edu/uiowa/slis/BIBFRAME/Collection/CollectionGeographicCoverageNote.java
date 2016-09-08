package edu.uiowa.slis.BIBFRAME.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionGeographicCoverageNote extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CollectionGeographicCoverageNote currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionGeographicCoverageNote.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CollectionGeographicCoverageNoteIterator theCollection = (CollectionGeographicCoverageNoteIterator)findAncestorWithClass(this, CollectionGeographicCoverageNoteIterator.class);
			pageContext.getOut().print(theCollection.getGeographicCoverageNote());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for geographicCoverageNote tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for geographicCoverageNote tag ");
		}
		return SKIP_BODY;
	}
}

